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

RPM_NAME = "powermock-junit4-1.6.5-4.11.noarch.rpm"
RPM_HASH = "6e71327a465c8da2c8642118bf0838b7d60b5a04271953b315a882189ca0f2348b1fcd3a1cbf94e37893ea43bc5b5fe35198ddee5a4b49614b7503b846194d45"
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
