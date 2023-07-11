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

RPM_NAME = "powermock-api-mockito-1.6.5-4.11.noarch.rpm"
RPM_HASH = "263093257a0966d618d3a367f5d2356ed627c3c04ceb6c713e7f8a0401fe98ec572895e5b6cbc1323f398bfcb2ec59eea3889d6618c936039c046f6883dd5344"
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
