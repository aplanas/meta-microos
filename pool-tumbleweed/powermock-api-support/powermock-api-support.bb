SUMMARY = "PowerMock API support module"
DESCRIPTION = " \
PowerMock is a framework that extend other mock libraries \
such as EasyMock with more powerful capabilities. PowerMock uses a \
custom classloader and bytecode manipulation to enable mocking of \
static methods, constructors, final classes and methods, private \
methods, removal of static initializers and more. \
 \
This package contains support code for the PowerMock API extensions."
LICENSE = "Apache-2.0"

PV = "1.6.5"

RPM_NAME = "powermock-api-support-1.6.5-4.11.noarch.rpm"
RPM_HASH = "c329d5ab29cd485f9d54c967f55b25fb1276ab2a3957cf9ee283b6dfd8cd61adcbdef7be2e38340188c37e108f86749ba2ecda04760d1a2badf9b915791ede83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.powermock-powermock-api-support \
mvn-org.powermock-powermock-api-support-pom- \
osgi-org.powermock.powermock-api-support \
powermock-api-support"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.powermock-powermock-core \
mvn-org.powermock-powermock-reflect \
powermock-common"

inherit rpm
