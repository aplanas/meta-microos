SUMMARY = "RTF module for maven-doxia"
DESCRIPTION = "This package provides RTF module for maven-doxia."
LICENSE = "Apache-2.0"

PV = "1.9.1"

RPM_NAME = "maven-doxia-module-rtf-1.9.1-6.8.noarch.rpm"
RPM_HASH = "56c13c0255f8d0305bee432f2ac92dc7c42b3d96dfbc7d6801e9c28ccc187beb8375c7f5329cc887f784ef971f836ad83eb38851e5bf677a430cab0b25c4e478"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-doxia-module-rtf \
mvn-org.apache.maven.doxia-doxia-module-rtf \
mvn-org.apache.maven.doxia-doxia-module-rtf-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven.doxia-doxia-core \
mvn-org.apache.maven.doxia-doxia-sink-api \
mvn-org.codehaus.plexus-plexus-component-annotations"

inherit rpm
