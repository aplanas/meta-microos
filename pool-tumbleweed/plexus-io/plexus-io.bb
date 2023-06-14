SUMMARY = "Plexus IO Components"
DESCRIPTION = "Plexus IO is a set of plexus components, which are designed for use \
in I/O operations."
LICENSE = "Apache-2.0"

PV = "3.2.0"

RPM_NAME = "plexus-io-3.2.0-2.8.noarch.rpm"
RPM_HASH = "71c457e4026b5bb6772da20cd87bfde35a0a5671723a55efb571aa0ddb5839f2440f3dd80217f8cfcd6df2d7c73dff9dec19d9087aea9fd745dd0dfb09180b26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.codehaus.plexus-plexus-io \
mvn-org.codehaus.plexus-plexus-io-pom- \
plexus-io"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-io-commons-io \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
