SUMMARY = "Maven Plugin Tool for Java"
DESCRIPTION = "Descriptor extractor for plugins written in Java."
LICENSE = "Apache-2.0"

PV = "3.6.0"

RPM_NAME = "maven-plugin-tools-java-3.6.0-5.1.noarch.rpm"
RPM_HASH = "46ea1d0ff6e20f7dfeee584420570ee3bdfc2a99e95ae6dad0e7d31ef0e35a2d9ab933eb50b220770308deb044bd646d5f1e030e137fc4855a80e8ce695ab630"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-plugin-tools-java \
mvn-org.apache.maven.plugin-tools-maven-plugin-tools-java \
mvn-org.apache.maven.plugin-tools-maven-plugin-tools-java-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.thoughtworks.qdox-qdox \
mvn-org.apache.maven-maven-model \
mvn-org.apache.maven.plugin-tools-maven-plugin-tools-api \
mvn-org.codehaus.plexus-plexus-component-annotations \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
