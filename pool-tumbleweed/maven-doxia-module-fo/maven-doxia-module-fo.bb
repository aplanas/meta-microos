SUMMARY = "FO module for maven-doxia"
DESCRIPTION = "This package provides FO module for maven-doxia."
LICENSE = "Apache-2.0"

PV = "1.9.1"

RPM_NAME = "maven-doxia-module-fo-1.9.1-6.8.noarch.rpm"
RPM_HASH = "839493b065f5ef457362ac8b11ac27b560f66139d140c519eb03ffc744f0800bdfd90b598e9a3b20773408d217982735d1eab0f63456c966a90311ad4d88a365"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-doxia-module-fo \
mvn-org.apache.maven.doxia-doxia-module-fo \
mvn-org.apache.maven.doxia-doxia-module-fo-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-collections-commons-collections \
mvn-commons-configuration-commons-configuration \
mvn-log4j-log4j \
mvn-org.apache.maven.doxia-doxia-core \
mvn-org.apache.maven.doxia-doxia-logging-api \
mvn-org.apache.maven.doxia-doxia-sink-api \
mvn-org.apache.xmlgraphics-fop \
mvn-org.codehaus.plexus-plexus-component-annotations \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
