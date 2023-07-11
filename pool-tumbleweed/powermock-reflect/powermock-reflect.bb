SUMMARY = "Reflection module of PowerMock"
DESCRIPTION = " \
PowerMock is a framework that extend other mock libraries \
such as EasyMock with more powerful capabilities. PowerMock uses a \
custom classloader and bytecode manipulation to enable mocking of \
static methods, constructors, final classes and methods, private \
methods, removal of static initializers and more. \
 \
This package contains the reflection module of PowerMock."
LICENSE = "Apache-2.0"

PV = "1.6.5"

RPM_NAME = "powermock-reflect-1.6.5-4.11.noarch.rpm"
RPM_HASH = "394a167a0d9bde02138353e88a49fdc6e2382bc1cdef61fc12b078dceb5c4c984faa337c5e01f974cb02559bc3e47a10d81fa6923d21c3dce59e31973af52f32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.powermock-powermock-reflect \
mvn-org.powermock-powermock-reflect-pom- \
osgi-org.powermock.powermock-reflect \
powermock-reflect"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.objenesis-objenesis \
powermock-common"

inherit rpm
