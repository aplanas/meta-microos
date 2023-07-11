SUMMARY = "A library for instantiating Java objects"
DESCRIPTION = "Objenesis is a small Java library that serves one purpose: to instantiate \
a new object of a particular class. \
Java supports dynamic instantiation of classes using Class.newInstance(); \
however, this only works if the class has an appropriate constructor. There \
are many times when a class cannot be instantiated this way, such as when \
the class contains constructors that require arguments, that have side effects, \
and/or that throw exceptions. As a result, it is common to see restrictions \
in libraries stating that classes must require a default constructor. \
Objenesis aims to overcome these restrictions by bypassing the constructor \
on object instantiation. Needing to instantiate an object without calling \
the constructor is a fairly specialized task, however there are certain cases \
when this is useful: \
* Serialization, Remoting and Persistence - Objects need to be instantiated \
  and restored to a specific state, without invoking code. \
* Proxies, AOP Libraries and Mock Objects - Classes can be sub-classed without \
  needing to worry about the super() constructor. \
* Container Frameworks - Objects can be dynamically instantiated in \
  non-standard ways."
LICENSE = "Apache-2.0"

PV = "3.1"

RPM_NAME = "objenesis-3.1-2.7.noarch.rpm"
RPM_HASH = "2bd4ca496b942b9fa4359984d7fe22628f8dcf4c151f5dc66fca0b28e052044704bdd194cb646b9b545e6a3e556bca1c3dc26f2a0b76f1444116b54580cc975c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.objenesis-objenesis \
mvn-org.objenesis-objenesis-pom- \
mvn-org.objenesis-objenesis-tck \
mvn-org.objenesis-objenesis-tck-pom- \
objenesis \
osgi-org.objenesis"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
