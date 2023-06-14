SUMMARY = "Maven Archetype Descriptor model"
DESCRIPTION = "Maven Archetype Descriptor model."
LICENSE = "Apache-2.0"

PV = "3.2.1"

RPM_NAME = "maven-archetype-descriptor-3.2.1-1.9.noarch.rpm"
RPM_HASH = "2b8cfc03d9c3bbdc31503338e30951f232fb4a0a9f3b903502f5fa746fdc8fe4ab899c82fbafe6e7294800177a99cf9fc2ff6f3349c75ae529a600889ba84b00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-archetype-descriptor \
mvn-org.apache.maven.archetype-archetype-descriptor \
mvn-org.apache.maven.archetype-archetype-descriptor-pom- \
osgi-org.apache.maven.archetype.descriptor"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
