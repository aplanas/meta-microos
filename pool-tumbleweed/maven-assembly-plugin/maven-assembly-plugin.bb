SUMMARY = "Maven Assembly Plugin"
DESCRIPTION = "A Maven plugin to create archives of your project's sources, classes, \
dependencies etc. from flexible assembly descriptors."
LICENSE = "Apache-2.0"

PV = "3.3.0"

RPM_NAME = "maven-assembly-plugin-3.3.0-2.8.noarch.rpm"
RPM_HASH = "69228145b45ad11366a3dc0f5cc640828694193f14655c4fadf509f1b79088270af0a7ad07e5094c0e35bc5a1f25d0ad9349f38359c1c6b2b67b478e50f7c04c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-assembly-plugin \
mvn(org.apache.maven.plugins:maven-assembly-plugin) \
mvn(org.apache.maven.plugins:maven-assembly-plugin:pom:)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(commons-codec:commons-codec) \
mvn(commons-io:commons-io) \
mvn(org.apache.maven.shared:file-management) \
mvn(org.apache.maven.shared:maven-artifact-transfer) \
mvn(org.apache.maven.shared:maven-common-artifact-filters) \
mvn(org.apache.maven.shared:maven-filtering) \
mvn(org.apache.maven.shared:maven-shared-io) \
mvn(org.apache.maven:maven-archiver) \
mvn(org.apache.maven:maven-artifact) \
mvn(org.apache.maven:maven-core) \
mvn(org.apache.maven:maven-model) \
mvn(org.apache.maven:maven-plugin-api) \
mvn(org.codehaus.plexus:plexus-archiver) \
mvn(org.codehaus.plexus:plexus-interpolation) \
mvn(org.codehaus.plexus:plexus-io) \
mvn(org.codehaus.plexus:plexus-utils)"

inherit rpm
