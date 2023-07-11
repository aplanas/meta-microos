SUMMARY = "Latex module for maven-doxia"
DESCRIPTION = "This package provides Latex module for maven-doxia."
LICENSE = "Apache-2.0"

PV = "1.9.1"

RPM_NAME = "maven-doxia-module-latex-1.9.1-6.8.noarch.rpm"
RPM_HASH = "c1262221c2de2a26236f120feba6eaaae967a6037efb6ba63fe5bdf5f806063a7c9461440188da1b25f31f6693d1dbb89ed175d0e93aa2a2bf60e53f81695065"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-doxia-module-latex \
mvn-org.apache.maven.doxia-doxia-module-latex \
mvn-org.apache.maven.doxia-doxia-module-latex-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven.doxia-doxia-core \
mvn-org.apache.maven.doxia-doxia-sink-api \
mvn-org.codehaus.plexus-plexus-component-annotations \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
