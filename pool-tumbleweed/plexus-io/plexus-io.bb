SUMMARY = "Plexus IO Components"
DESCRIPTION = "Plexus IO is a set of plexus components, which are designed for use \
in I/O operations."
LICENSE = "Apache-2.0"

PV = "3.2.0"

RPM_NAME = "plexus-io-3.2.0-2.9.noarch.rpm"
RPM_HASH = "36e4ff2ca41cda4fdac75faa342d084a20f2f23bb0a96eb5dc85d463615fae3b67a2b04fe9ab893bae502581904172537bb915f411eab29a7fa4bd3653568020"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.codehaus.plexus-plexus-io \
mvn-org.codehaus.plexus-plexus-io-pom- \
plexus-io"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-io-commons-io \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
