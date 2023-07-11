SUMMARY = "Maven WAR Plugin"
DESCRIPTION = "Builds a Web Application Archive (WAR) file from the project output and its \
dependencies."
LICENSE = "Apache-2.0"

PV = "3.2.2"

RPM_NAME = "maven-war-plugin-3.2.2-3.11.noarch.rpm"
RPM_HASH = "43eb7a3d2a7800d84e8c2b3ae3028b8019167b4044100079a592c095e0331f521237a8a4c66a9e1fa97da2edc72f78aa5ba13d481f740940993cf8e6da88dc5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-war-plugin \
mvn-org.apache.maven.plugins-maven-war-plugin \
mvn-org.apache.maven.plugins-maven-war-plugin-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.thoughtworks.xstream-xstream \
mvn-commons-io-commons-io \
mvn-org.apache.maven-maven-archiver \
mvn-org.apache.maven-maven-core \
mvn-org.apache.maven-maven-plugin-api \
mvn-org.apache.maven.shared-maven-filtering \
mvn-org.apache.maven.shared-maven-mapping \
mvn-org.codehaus.plexus-plexus-archiver \
mvn-org.codehaus.plexus-plexus-interpolation \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
