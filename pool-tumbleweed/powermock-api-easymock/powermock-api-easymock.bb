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

RPM_NAME = "powermock-api-easymock-1.6.5-5.1.noarch.rpm"
RPM_HASH = "fb9126a5af596450979162da5d683d510145d0355c080804ca49f1acae9e4abcb32422f23db1e6d8631d1e9e9e684b398565fd9e6ba7faca037ab0eed68144c2"
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
