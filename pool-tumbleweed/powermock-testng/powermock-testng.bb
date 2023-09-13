SUMMARY = "PowerMock module for TestNG"
DESCRIPTION = " \
PowerMock is a framework that extend other mock libraries \
such as EasyMock with more powerful capabilities. PowerMock uses a \
custom classloader and bytecode manipulation to enable mocking of \
static methods, constructors, final classes and methods, private \
methods, removal of static initializers and more. \
 \
This package contains the PowerMock TestNG extension."
LICENSE = "Apache-2.0"

PV = "1.6.5"

RPM_NAME = "powermock-testng-1.6.5-5.1.noarch.rpm"
RPM_HASH = "d41a6db5ab8b5f5c468fcbc388840625601ea26c070bf26b50e8c8426c01bf8b4c471586c06e3cbda8b43f5d3fb2a1b8b55cc34d66857da1d1977a52a2bc8175"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.powermock-powermock-module-testng \
mvn-org.powermock-powermock-module-testng-common \
mvn-org.powermock-powermock-module-testng-common-pom- \
mvn-org.powermock-powermock-module-testng-pom- \
osgi-org.powermock.powermock-module-testng \
osgi-org.powermock.powermock-module-testng-common \
powermock-testng"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.powermock-powermock-core \
mvn-org.powermock-powermock-reflect \
mvn-org.testng-testng \
powermock-common"

inherit rpm
