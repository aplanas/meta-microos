SUMMARY = "The The websocket-client module for Jetty"
DESCRIPTION = "%{extdesc} The The websocket-client module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.51"

RPM_NAME = "jetty-websocket-client-9.4.51-1.2.noarch.rpm"
RPM_HASH = "cf042350746c13ffea53967bdea0bed3f0c1b011aaee51b559f9c368ca0ca49f2cc878f5218263950006ab82ab81bcd2e15fc75f27bfb8dcbad0247776f65c1e"
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
