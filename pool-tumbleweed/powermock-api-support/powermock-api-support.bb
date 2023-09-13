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

RPM_NAME = "powermock-api-support-1.6.5-5.1.noarch.rpm"
RPM_HASH = "6d2d9680fad9e90aaf393448b84388e912b95831b67f48e1e51960923f592258d27ad312badec1a1955fbc181b8cacb6772bdb7368f83fb3e26b16fd932d23f0"
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
