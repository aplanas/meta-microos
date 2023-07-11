SUMMARY = "Plugin for creating source JARs"
DESCRIPTION = "The Maven Source Plugin creates a JAR archive of the \
source files of the current project."
LICENSE = "Apache-2.0"

PV = "3.0.1"

RPM_NAME = "maven-source-plugin-3.0.1-3.11.noarch.rpm"
RPM_HASH = "0bba36988a3574f31516427043bc1b4bc315f278a23cf46bba0e23dfd8bcf8888c48ce7b7b06d8ddd958683ed282164ab4d7e878fe7e43b87a38aa907ed85904"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-source-plugin \
mvn-org.apache.maven.plugins-maven-source-plugin \
mvn-org.apache.maven.plugins-maven-source-plugin-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven-maven-archiver \
mvn-org.apache.maven-maven-artifact \
mvn-org.apache.maven-maven-core \
mvn-org.apache.maven-maven-model \
mvn-org.apache.maven-maven-plugin-api \
mvn-org.codehaus.plexus-plexus-archiver \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
