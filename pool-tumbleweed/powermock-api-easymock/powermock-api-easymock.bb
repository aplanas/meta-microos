SUMMARY = "PowerMock EasyMock API module"
DESCRIPTION = " \
PowerMock is a framework that extend other mock libraries \
such as EasyMock with more powerful capabilities. PowerMock uses a \
custom classloader and bytecode manipulation to enable mocking of \
static methods, constructors, final classes and methods, private \
methods, removal of static initializers and more. \
 \
This package contains the PowerMock EasyMock API extension."
LICENSE = "Apache-2.0"

PV = "1.6.5"

RPM_NAME = "powermock-api-easymock-1.6.5-4.11.noarch.rpm"
RPM_HASH = "a02d2803bb4cc52bf1681114bcde51227ac3dc06c4e1d9d8f75b05fa94ae791544986cbc55350009fe0fe13d375b37fd33946e37cf57da67cd4957a44366075b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.powermock-powermock-api-easymock \
mvn-org.powermock-powermock-api-easymock-pom- \
osgi-org.powermock.powermock-api-easymock \
powermock-api-easymock"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-cglib-cglib-nodep \
mvn-org.powermock-powermock-api-support \
powermock-common"

inherit rpm
