SUMMARY = "The The websocket-client module for Jetty"
DESCRIPTION = "%{extdesc} The The websocket-client module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.51"

RPM_NAME = "jetty-websocket-client-9.4.51-1.1.noarch.rpm"
RPM_HASH = "12d9592730182c4a9e20034cfd73577ee8190a2e4b4bf4be9b26663d40424816ebd921fdff1289f87690a73a3da72a359de2299cf619128a4676ee3bd6eb017d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-websocket-client \
mvn-org.eclipse.jetty.websocket-websocket-client \
mvn-org.eclipse.jetty.websocket-websocket-client-pom- \
osgi-org.eclipse.jetty.websocket.client"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.eclipse.jetty-jetty-client \
mvn-org.eclipse.jetty-jetty-io \
mvn-org.eclipse.jetty-jetty-util \
mvn-org.eclipse.jetty.websocket-websocket-common"

inherit rpm
