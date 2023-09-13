SUMMARY = "Maven dependency analyzer"
DESCRIPTION = "Analyzes the dependencies of a project for undeclared or unused artifacts. \
 \
Warning: Analysis is not done at source but bytecode level, then some cases are \
not detected (constants, annotations with source-only retention, links in \
javadoc) which can lead to wrong result if they are the only use of a \
dependency."
LICENSE = "Apache-2.0"

PV = "1.10"

RPM_NAME = "maven-dependency-analyzer-1.10-4.1.noarch.rpm"
RPM_HASH = "5f347ed2d88a1cc6621b2114e87f0a7fb999fc5ae2c7de087f2c7c83d830fc469091c210c261838b74a18cca2c3cd2b9262cf5f1680f6e6961fd2ef101f6cc02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-dependency-analyzer \
mvn-org.apache.maven.shared-maven-dependency-analyzer \
mvn-org.apache.maven.shared-maven-dependency-analyzer-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven-maven-artifact \
mvn-org.apache.maven-maven-core \
mvn-org.apache.maven-maven-model \
mvn-org.codehaus.plexus-plexus-component-annotations \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.ow2.asm-asm"

inherit rpm
