SUMMARY = "FO module for maven-doxia"
DESCRIPTION = "This package provides FO module for maven-doxia."
LICENSE = "Apache-2.0"

PV = "1.9.1"

RPM_NAME = "maven-doxia-module-fo-1.9.1-6.7.noarch.rpm"
RPM_HASH = "5223bbda86f425777ed8e1ae0b8fd24c28b0bec406bcf42cf83b09a23e1f1c9b0f98720cd24d438172b5b5ea0ac1b7b57e29c8f37c2319687957a3f2b0142619"
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
