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

RPM_NAME = "powermock-testng-1.6.5-4.11.noarch.rpm"
RPM_HASH = "ce4b5013ea85382b6b64971f248dcdc1a07039a51d352678468252ed57008a4e50147b410107e4977a3743495ec3e6d7501c3ee83667eefc1990bacf97adc48c"
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
