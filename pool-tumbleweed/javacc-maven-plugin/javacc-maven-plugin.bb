SUMMARY = "Maven Plugin for processing JavaCC grammar files"
DESCRIPTION = "Maven Plugin for processing JavaCC grammar files."
LICENSE = "Apache-2.0"

PV = "2.6"

RPM_NAME = "javacc-maven-plugin-2.6-2.11.noarch.rpm"
RPM_HASH = "a9d36463873118b8be16d7a95967a6ccdddce66fc05fc88559d5155bd79e354fc418990269d6656eb8d46350ebb25c8652a2f0d00d76e3de26bab7770a81b053"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "javacc-maven-plugin \
mvn-org.codehaus.mojo-javacc-maven-plugin \
mvn-org.codehaus.mojo-javacc-maven-plugin-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-net.java.dev.javacc-javacc \
mvn-org.apache.maven-maven-model \
mvn-org.apache.maven-maven-plugin-api \
mvn-org.apache.maven-maven-project \
mvn-org.apache.maven.doxia-doxia-sink-api \
mvn-org.apache.maven.doxia-doxia-site-renderer \
mvn-org.apache.maven.reporting-maven-reporting-api \
mvn-org.apache.maven.reporting-maven-reporting-impl \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
