package datamember;
//here we cretaed pacakage as datamember which that organizes a set of related classes and interfaces
public class Object {
	//public : members which can access as public
	//class : is a context of java that are used to create objects and to define object data types and methods.
	//declares a class called Linking.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//public : it can be called from anywhere.
		//static : doesn't belong to a specific object.
		//void : returns to no value.
		//main : is special because it will start the program.
		int var=6;//var is equal to 1 and initialize to integer data type
		//Second is name of the class
		//second is a reference variable
		//new is operator that which allocates memory to an object
		//Second is constructor call
		System.out.println(var);
		var=Second.test(var);//prints out 1
		System.out.println(var);
		//system : is a class in java language pacakge.
		//out : static member of the system class.
		//prints again 1 even though we changed it
		//creating an object and adding the value to it.printing the value and calls the class
	}

}
class Second
{
 static int test(int var)
	//means that the variable or function is shared between all instances of that class
 //as it belongs to the type
	{
		var=9;
		//we try to change to 2 and it works in this class but when it doesn't change in the
		// class "data member"
		System.out.println(var);//prints out 2
		//system : is a class in java language pacakge.
		//out : static member of the system class.
		//println : to print what is output.
		return var;
	}

	}


