SUMMARY = "Maven Plugin Plugin"
DESCRIPTION = "The Plugin Plugin is used to create a Maven plugin descriptor for any Mojo's \
found in the source tree, to include in the JAR. It is also used to generate \
Xdoc files for the Mojos as well as for updating the plugin registry, the \
artifact metadata and a generic help goal."
LICENSE = "Apache-2.0"

PV = "3.6.0"

RPM_NAME = "maven-plugin-plugin-3.6.0-7.1.noarch.rpm"
RPM_HASH = "5434824da23826c1544cc2c09d1325597c81e619d74bc805f61d98fb0b66310f7e65f188dafb3441a7cdbea9b7fac91538e3e8c27eee403d462408e503c42ea8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-plugin-plugin \
mvn-org.apache.maven.plugins-maven-plugin-plugin \
mvn-org.apache.maven.plugins-maven-plugin-plugin-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven-maven-artifact \
mvn-org.apache.maven-maven-compat \
mvn-org.apache.maven-maven-model \
mvn-org.apache.maven-maven-plugin-api \
mvn-org.apache.maven-maven-repository-metadata \
mvn-org.apache.maven.doxia-doxia-sink-api \
mvn-org.apache.maven.doxia-doxia-site-renderer \
mvn-org.apache.maven.plugin-tools-maven-plugin-annotations \
mvn-org.apache.maven.plugin-tools-maven-plugin-tools-annotations \
mvn-org.apache.maven.plugin-tools-maven-plugin-tools-api \
mvn-org.apache.maven.plugin-tools-maven-plugin-tools-generators \
mvn-org.apache.maven.plugin-tools-maven-plugin-tools-java \
mvn-org.apache.maven.reporting-maven-reporting-api \
mvn-org.apache.maven.reporting-maven-reporting-impl \
mvn-org.apache.velocity-velocity \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.codehaus.plexus-plexus-velocity"

inherit rpm
