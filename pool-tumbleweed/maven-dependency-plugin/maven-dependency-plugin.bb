SUMMARY = "Plugin to manipulate, copy and unpack local and remote artifacts"
DESCRIPTION = " \
The dependency plugin provides the capability to manipulate \
artifacts. It can copy and/or unpack artifacts from local or remote \
repositories to a specified location."
LICENSE = "Apache-2.0"

PV = "3.1.2"

RPM_NAME = "maven-dependency-plugin-3.1.2-1.17.noarch.rpm"
RPM_HASH = "2e55cb6c8d1a0c81b00f797f9c750af341644312570f37a1b2f2e49409acaf4001dd07f414f8feddc3e5549c8592dd8e2535e8b1312cd5e9a9e777daf2aefb48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-dependency-plugin \
mvn(org.apache.maven.plugins:maven-dependency-plugin) \
mvn(org.apache.maven.plugins:maven-dependency-plugin:pom:)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(classworlds:classworlds) \
mvn(commons-collections:commons-collections) \
mvn(commons-io:commons-io) \
mvn(commons-lang:commons-lang) \
mvn(org.apache.maven.doxia:doxia-core) \
mvn(org.apache.maven.doxia:doxia-sink-api) \
mvn(org.apache.maven.doxia:doxia-site-renderer) \
mvn(org.apache.maven.reporting:maven-reporting-api) \
mvn(org.apache.maven.reporting:maven-reporting-impl) \
mvn(org.apache.maven.shared:file-management) \
mvn(org.apache.maven.shared:maven-artifact-transfer) \
mvn(org.apache.maven.shared:maven-common-artifact-filters) \
mvn(org.apache.maven.shared:maven-dependency-analyzer) \
mvn(org.apache.maven.shared:maven-dependency-tree) \
mvn(org.apache.maven.shared:maven-shared-utils) \
mvn(org.apache.maven:maven-artifact) \
mvn(org.apache.maven:maven-core) \
mvn(org.apache.maven:maven-model) \
mvn(org.apache.maven:maven-plugin-api) \
mvn(org.apache.maven:maven-repository-metadata) \
mvn(org.codehaus.plexus:plexus-archiver) \
mvn(org.codehaus.plexus:plexus-io) \
mvn(org.codehaus.plexus:plexus-utils)"

inherit rpm
