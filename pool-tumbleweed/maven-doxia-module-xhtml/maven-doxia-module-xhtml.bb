SUMMARY = "XHTML module for maven-doxia"
DESCRIPTION = "This package provides XHTML module for maven-doxia."
LICENSE = "Apache-2.0"

PV = "1.9.1"

RPM_NAME = "maven-doxia-module-xhtml-1.9.1-6.8.noarch.rpm"
RPM_HASH = "553887d98094413e348ed8a3ecab1f5cb8d9a704282834d6431918564312fa0bc9e14406f9fa110a69703b8c4e935c2f6266f7d25a56450f8f095c7d6218af92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-doxia-module-xhtml \
mvn-org.apache.maven.doxia-doxia-module-xhtml \
mvn-org.apache.maven.doxia-doxia-module-xhtml-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven.doxia-doxia-core \
mvn-org.apache.maven.doxia-doxia-sink-api \
mvn-org.codehaus.plexus-plexus-component-annotations \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
