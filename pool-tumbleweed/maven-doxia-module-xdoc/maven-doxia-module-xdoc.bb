SUMMARY = "XDoc module for maven-doxia"
DESCRIPTION = "This package provides XDoc module for maven-doxia."
LICENSE = "Apache-2.0"

PV = "1.9.1"

RPM_NAME = "maven-doxia-module-xdoc-1.9.1-6.8.noarch.rpm"
RPM_HASH = "e224896c0f18ab79ad3cb934d416f050252cf930cbdca1aef0e488dd20ac99edb96726aca9b49993d95345a9d6e3b5b74bc842182900bc06b825d73bdd6b6878"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-doxia-module-xdoc \
mvn-org.apache.maven.doxia-doxia-module-xdoc \
mvn-org.apache.maven.doxia-doxia-module-xdoc-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven.doxia-doxia-core \
mvn-org.apache.maven.doxia-doxia-sink-api \
mvn-org.codehaus.plexus-plexus-component-annotations \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
