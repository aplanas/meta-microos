SUMMARY = "API for plexus-interactivity"
DESCRIPTION = "API module for plexus-interactivity."
LICENSE = "MIT"

PV = "1.0~alpha6"

RPM_NAME = "plexus-interactivity-api-1.0~alpha6-2.7.noarch.rpm"
RPM_HASH = "4b1f31332bc59b767f6db1eb41fde668078237ed0c35944828f68e6d7bd9a781351ebbe6b69571bd3430bd9599126df9e92fbb6d06809f7be3c3e1ea416b2fc7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.codehaus.plexus-plexus-interactivity-api \
mvn-org.codehaus.plexus-plexus-interactivity-api-pom- \
plexus-interactivity-api"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.codehaus.plexus-plexus-component-api \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
