SUMMARY = "Plexus Components POM"
DESCRIPTION = "This package provides Plexus Components parent POM used by different \
Plexus packages."
LICENSE = "Apache-2.0"

PV = "1.3.1"

RPM_NAME = "plexus-components-pom-1.3.1-1.11.noarch.rpm"
RPM_HASH = "47fe051f28ee536d25b255d5fb70507e336974fc1a902508922aa67593653722ba9e6d835be6c156477a5dfd4149726c2045e91438caa7e36ed0af8f77dd3d7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.codehaus.plexus:plexus-components:pom:) \
plexus-components-pom"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.codehaus.plexus:plexus-component-metadata) \
mvn(org.codehaus.plexus:plexus:pom:)"

inherit rpm
