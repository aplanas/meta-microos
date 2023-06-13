SUMMARY = "Maven Script Interpreter"
DESCRIPTION = "This component provides some utilities to interpret/execute some scripts for \
various implementations: Groovy or BeanShell. \
 \
Groovy script is currently disabled."
LICENSE = "Apache-2.0"

PV = "1.3"

RPM_NAME = "maven-script-interpreter-1.3-1.4.noarch.rpm"
RPM_HASH = "1e02c79e70473868531c53f729201066388a45c87e0d2b86c5d03c48ecd3beb8c83d7f366275c053757e9d1b088f9ee539a4319f2e93f09b32307737706091ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-script-interpreter \
mvn(org.apache.maven.shared:maven-script-interpreter) \
mvn(org.apache.maven.shared:maven-script-interpreter:pom:)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(commons-io:commons-io) \
mvn(org.apache-extras.beanshell:bsh) \
mvn(org.slf4j:slf4j-api)"

inherit rpm
