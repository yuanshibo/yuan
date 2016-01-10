package yuan;

import java.lang.String;
import java.sql.*;

public class Yuan {

	public static void main(String[] args) {
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://127.0.0.1:3306/yuan";
		String user = "root";
		String password = "424008";
		try{
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, user, password);
			//if(!conn.isClosed()) System.out.println("Succeeded connecting to the Database!");
			Statement statement = conn.createStatement();
			//PreparedStatement Statement=conn.prepareStatement("INSERT INTO user VALUES(?,?)");
			//statement.setString(1,"chongshi"); 
			//statement.setString(2,"bo"); 
			//statement.executeUpdate();
			//版本控制测试
			String sql = "select * from EN_HITO";
			ResultSet rs = statement.executeQuery(sql);
			while(rs.next()) { 
				System.out.println("hitoname:"+rs.getString("hitoname"));
			}
			rs.close();  
			conn.close();
		} catch(ClassNotFoundException e) {   
				System.out.println("Sorry,can`t find the Driver!");   
				e.printStackTrace();   
			} catch(SQLException e) {   
				e.printStackTrace();   
			} catch(Exception e) {   
				e.printStackTrace();   
			}   
	}

}
