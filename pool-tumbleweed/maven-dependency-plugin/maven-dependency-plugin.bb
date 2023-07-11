SUMMARY = "Plugin to manipulate, copy and unpack local and remote artifacts"
DESCRIPTION = " \
The dependency plugin provides the capability to manipulate \
artifacts. It can copy and/or unpack artifacts from local or remote \
repositories to a specified location."
LICENSE = "Apache-2.0"

PV = "3.1.2"

RPM_NAME = "maven-dependency-plugin-3.1.2-1.18.noarch.rpm"
RPM_HASH = "507a3fa522c0f849290baf4b77d4ea7d7f49832649e1797f330e6353f486367f5fb1d96bf7cdb8b1e0d448c9fcb484aff43880e01a1a7c8879aa2e825bb86a17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-dependency-plugin \
mvn-org.apache.maven.plugins-maven-dependency-plugin \
mvn-org.apache.maven.plugins-maven-dependency-plugin-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-classworlds-classworlds \
mvn-commons-collections-commons-collections \
mvn-commons-io-commons-io \
mvn-commons-lang-commons-lang \
mvn-org.apache.maven-maven-artifact \
mvn-org.apache.maven-maven-core \
mvn-org.apache.maven-maven-model \
mvn-org.apache.maven-maven-plugin-api \
mvn-org.apache.maven-maven-repository-metadata \
mvn-org.apache.maven.doxia-doxia-core \
mvn-org.apache.maven.doxia-doxia-sink-api \
mvn-org.apache.maven.doxia-doxia-site-renderer \
mvn-org.apache.maven.reporting-maven-reporting-api \
mvn-org.apache.maven.reporting-maven-reporting-impl \
mvn-org.apache.maven.shared-file-management \
mvn-org.apache.maven.shared-maven-artifact-transfer \
mvn-org.apache.maven.shared-maven-common-artifact-filters \
mvn-org.apache.maven.shared-maven-dependency-analyzer \
mvn-org.apache.maven.shared-maven-dependency-tree \
mvn-org.apache.maven.shared-maven-shared-utils \
mvn-org.codehaus.plexus-plexus-archiver \
mvn-org.codehaus.plexus-plexus-io \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
