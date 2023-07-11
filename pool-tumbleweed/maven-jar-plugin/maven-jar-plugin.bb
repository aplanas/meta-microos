SUMMARY = "Maven JAR Plugin"
DESCRIPTION = "Builds a Java Archive (JAR) file from the compiled \
project classes and resources."
LICENSE = "Apache-2.0"

PV = "3.2.2"

RPM_NAME = "maven-jar-plugin-3.2.2-3.8.noarch.rpm"
RPM_HASH = "eab22e28ffae8f2e5ee88d826c1858f32ffda4377f514426688b803ddae0597aead46ebb10f5a32a7f5a4ef5dd01cd2e138c5f234b20dcdece5ab4768fa9e19b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-jar-plugin \
mvn-org.apache.maven.plugins-maven-jar-plugin \
mvn-org.apache.maven.plugins-maven-jar-plugin-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven-maven-archiver \
mvn-org.apache.maven-maven-artifact \
mvn-org.apache.maven-maven-core \
mvn-org.apache.maven-maven-plugin-api \
mvn-org.apache.maven.shared-file-management \
mvn-org.apache.maven.shared-maven-shared-utils \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
