SUMMARY = "Maven Plugin Description Model"
DESCRIPTION = "Maven plugin descriptor artifact"
LICENSE = "Apache-2.0"

PV = "2.2.1"

RPM_NAME = "maven-plugin-descriptor-2.2.1-3.9.noarch.rpm"
RPM_HASH = "6555a9548474b6fb77a9a25ae877f434f58e9013cd0cafa21e2b46b39c713fdb7ccefa9bcac2b9104c01dd0f7206a5ba707f3838deaaf81d77a1fe04085ec28e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-plugin-descriptor \
mvn-org.apache.maven-maven-plugin-descriptor \
mvn-org.apache.maven-maven-plugin-descriptor-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven-maven-artifact \
mvn-org.apache.maven-maven-plugin-api \
mvn-org.codehaus.plexus-plexus-container-default"

inherit rpm
