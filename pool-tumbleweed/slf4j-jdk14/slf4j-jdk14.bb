SUMMARY = "SLF4J JDK14 Binding"
DESCRIPTION = "SLF4J JDK14 Binding."
LICENSE = "Apache-2.0 & MIT"

PV = "1.7.36"

RPM_NAME = "slf4j-jdk14-1.7.36-4.1.noarch.rpm"
RPM_HASH = "f6b0a0c16bb41654b6eb37d3f6b71558c2a3e5413ff54c5c91e2a34d64cec1ff5697c70cb6ffb4b817a98436e012f9640dff6d2bc43525050bb6d6546f5831f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.slf4j:slf4j-jdk14) \
mvn(org.slf4j:slf4j-jdk14:pom:) \
osgi(slf4j.jdk14) \
slf4j-jdk14"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.slf4j:slf4j-api)"

inherit rpm
