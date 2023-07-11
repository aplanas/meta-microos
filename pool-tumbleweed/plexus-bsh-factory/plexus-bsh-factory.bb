SUMMARY = "Plexus Bsh component factory"
DESCRIPTION = "Bsh component class creator for Plexus."
LICENSE = "MIT"

PV = "1.0~a7"

RPM_NAME = "plexus-bsh-factory-1.0~a7-2.7.noarch.rpm"
RPM_HASH = "de740479083148dd8de61e478106594beabd4a8cd417ea6f37d93b6cc5072dfcdc153fc2221e80a80ffb6b5f77d998ea362bffae530d4ebf9a4b1232e8ed6073"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.codehaus.plexus-plexus-bsh-factory \
mvn-org.codehaus.plexus-plexus-bsh-factory-pom- \
plexus-bsh-factory"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-bsh-bsh \
mvn-classworlds-classworlds \
mvn-org.codehaus.plexus-plexus-container-default \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
