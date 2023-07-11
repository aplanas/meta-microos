SUMMARY = "Maven dependency analyzer"
DESCRIPTION = "Analyzes the dependencies of a project for undeclared or unused artifacts. \
 \
Warning: Analysis is not done at source but bytecode level, then some cases are \
not detected (constants, annotations with source-only retention, links in \
javadoc) which can lead to wrong result if they are the only use of a \
dependency."
LICENSE = "Apache-2.0"

PV = "1.10"

RPM_NAME = "maven-dependency-analyzer-1.10-3.13.noarch.rpm"
RPM_HASH = "1793231ef35c4fb89febe412f7034297038e1cf7ff3dc1738950abc6044729bb6feb5e15c08f4c1cd89e2bcc4457f6ecfa13374e34e911a313d0eaa85769f2b4"
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
