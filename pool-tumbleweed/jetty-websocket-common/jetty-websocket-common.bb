SUMMARY = "The websocket-common module for Jetty"
DESCRIPTION = "%{extdesc} The websocket-common module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.51"

RPM_NAME = "jetty-websocket-common-9.4.51-2.1.noarch.rpm"
RPM_HASH = "90740a2fca4a1abc9062a10ad9370223ef4c011ec7f00af82e12f11afbb3e04658a27bcb98878a72c4568357d5c962b8a6c7f2bb09feb13f64281f5978888c10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-websocket-common \
mvn-org.eclipse.jetty.websocket-websocket-common \
mvn-org.eclipse.jetty.websocket-websocket-common-pom- \
osgi-org.eclipse.jetty.websocket.common"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.eclipse.jetty-jetty-io \
mvn-org.eclipse.jetty-jetty-util \
mvn-org.eclipse.jetty.websocket-websocket-api"

inherit rpm
