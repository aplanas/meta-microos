SUMMARY = "TWiki module for maven-doxia"
DESCRIPTION = "This package provides TWiki module for maven-doxia."
LICENSE = "Apache-2.0"

PV = "1.9.1"

RPM_NAME = "maven-doxia-module-twiki-1.9.1-6.8.noarch.rpm"
RPM_HASH = "7f4f3f307bc01590133f67f56f3b1db1d10dfe43f1f4fbc8e9d2ac48687d9d079e189d4451cee9a3891c567b213a5d66ce8a7988b1b932f68dc342afa48a5d3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-doxia-module-twiki \
mvn-org.apache.maven.doxia-doxia-module-twiki \
mvn-org.apache.maven.doxia-doxia-module-twiki-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven.doxia-doxia-core \
mvn-org.apache.maven.doxia-doxia-sink-api \
mvn-org.codehaus.plexus-plexus-component-annotations \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
