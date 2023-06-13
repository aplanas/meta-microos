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

RPM_NAME = "powermock-api-support-1.6.5-4.10.noarch.rpm"
RPM_HASH = "c75b532b0bde077df508806b2d5aac4f43336f9e590b99b3e07077a08c85f5baec50ead175739b59eff761e5356b60560149afac6f3b40816f004fd7bdee6503"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.powermock:powermock-api-support) \
mvn(org.powermock:powermock-api-support:pom:) \
osgi(org.powermock.powermock-api-support) \
powermock-api-support"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.powermock:powermock-core) \
mvn(org.powermock:powermock-reflect) \
powermock-common"

inherit rpm
