SUMMARY = "XHTML5 module for maven-doxia"
DESCRIPTION = "This package provides XHTML5 module for maven-doxia."
LICENSE = "Apache-2.0"

PV = "1.9.1"

RPM_NAME = "maven-doxia-module-xhtml5-1.9.1-6.8.noarch.rpm"
RPM_HASH = "e7572f1c9c8cd77d9268c447ffc78c43d3f6d5687f62b24a5597024e7d9ddbbac394b07220003da96d5ea33008072528354e49cec3ccfeeacc97af0243f732c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-doxia-module-xhtml5 \
mvn-org.apache.maven.doxia-doxia-module-xhtml5 \
mvn-org.apache.maven.doxia-doxia-module-xhtml5-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven.doxia-doxia-core \
mvn-org.apache.maven.doxia-doxia-sink-api \
mvn-org.codehaus.plexus-plexus-component-annotations \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
