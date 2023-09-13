SUMMARY = "PowerMock Mockito API module"
DESCRIPTION = " \
PowerMock is a framework that extend other mock libraries \
such as EasyMock with more powerful capabilities. PowerMock uses a \
custom classloader and bytecode manipulation to enable mocking of \
static methods, constructors, final classes and methods, private \
methods, removal of static initializers and more. \
 \
This package contains the PowerMock Mockito API extension."
LICENSE = "Apache-2.0 & MIT"

PV = "1.6.5"

RPM_NAME = "powermock-api-mockito-1.6.5-5.1.noarch.rpm"
RPM_HASH = "c5844d63db069781ddb830e3ae6b577e18913d6e8682d90910ede4030521f4bfc1e023790c31ea5e5f5f9ef4f025b30b43ca20dc8f0ebf3191a92620abdc2d22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bundled-mockito \
mvn-org.powermock-powermock-api-mockito \
mvn-org.powermock-powermock-api-mockito-common \
mvn-org.powermock-powermock-api-mockito-common-pom- \
mvn-org.powermock-powermock-api-mockito-pom- \
osgi-org.powermock.powermock-api-mockito \
osgi-org.powermock.powermock-api-mockito-common \
powermock-api-mockito"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.hamcrest-hamcrest-core \
mvn-org.mockito-mockito-core \
mvn-org.powermock-powermock-api-support \
powermock-common"

inherit rpm
