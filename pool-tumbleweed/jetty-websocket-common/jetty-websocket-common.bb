SUMMARY = "The websocket-common module for Jetty"
DESCRIPTION = "%{extdesc} The websocket-common module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.51"

RPM_NAME = "jetty-websocket-common-9.4.51-1.2.noarch.rpm"
RPM_HASH = "485006d58c7efe0df5f18726c8006688e8d3734379e232390c456ef897cc9fb27df15aa93645f278fd95aea6d2e9c1a01369fb3ba1dcf23287e8e7a4899407c8"
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
