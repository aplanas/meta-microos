SUMMARY = "JUnit4 common module of PowerMock"
DESCRIPTION = " \
PowerMock is a framework that extend other mock libraries \
such as EasyMock with more powerful capabilities. PowerMock uses a \
custom classloader and bytecode manipulation to enable mocking of \
static methods, constructors, final classes and methods, private \
methods, removal of static initializers and more. \
 \
This package contains the JUnit4 module of PowerMock."
LICENSE = "Apache-2.0"

PV = "1.6.5"

RPM_NAME = "powermock-junit4-1.6.5-5.1.noarch.rpm"
RPM_HASH = "f13e5753839a8fbdffc4a580a8efd99334b45d638a4453e61132417b87028e26f389eca25659bbd93d5e474c639edbd312e8598a895a6e888567d19972a156fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.powermock-powermock-module-junit4 \
mvn-org.powermock-powermock-module-junit4-common \
mvn-org.powermock-powermock-module-junit4-common-pom- \
mvn-org.powermock-powermock-module-junit4-pom- \
mvn-org.powermock-powermock-module-junit4-rule \
mvn-org.powermock-powermock-module-junit4-rule-pom- \
osgi-org.powermock.powermock-module-junit4 \
osgi-org.powermock.powermock-module-junit4-common \
osgi-org.powermock.powermock-module-junit4-rule \
powermock-junit4"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-junit-junit \
mvn-org.powermock-powermock-classloading-base \
mvn-org.powermock-powermock-core \
mvn-org.powermock-powermock-reflect \
powermock-common"

inherit rpm
