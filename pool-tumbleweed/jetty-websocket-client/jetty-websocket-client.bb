SUMMARY = "The The websocket-client module for Jetty"
DESCRIPTION = "%{extdesc} The The websocket-client module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.51"

RPM_NAME = "jetty-websocket-client-9.4.51-2.1.noarch.rpm"
RPM_HASH = "b3cf6ba3b7630d14191b955aee7506fb196e8a1d3ec9341beaa37834efbd85ea66d45acacb3d7288a399d56c2951a4b1e6886f6c81299ea3b21a130484c81ace"
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
