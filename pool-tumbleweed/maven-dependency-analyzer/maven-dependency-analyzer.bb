SUMMARY = "Maven dependency analyzer"
DESCRIPTION = "Analyzes the dependencies of a project for undeclared or unused artifacts. \
 \
Warning: Analysis is not done at source but bytecode level, then some cases are \
not detected (constants, annotations with source-only retention, links in \
javadoc) which can lead to wrong result if they are the only use of a \
dependency."
LICENSE = "Apache-2.0"

PV = "1.10"

RPM_NAME = "maven-dependency-analyzer-1.10-3.12.noarch.rpm"
RPM_HASH = "9dec370d28964e643c3ce065e8b2cdb73b3faa1d9d6c9b7925895b40d211b648332eec1d226d25672bc89294e953463063365c20ec9210e7507dd3456c927772"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-dependency-analyzer \
mvn(org.apache.maven.shared:maven-dependency-analyzer) \
mvn(org.apache.maven.shared:maven-dependency-analyzer:pom:)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.apache.maven:maven-artifact) \
mvn(org.apache.maven:maven-core) \
mvn(org.apache.maven:maven-model) \
mvn(org.codehaus.plexus:plexus-component-annotations) \
mvn(org.codehaus.plexus:plexus-utils) \
mvn(org.ow2.asm:asm)"

inherit rpm
