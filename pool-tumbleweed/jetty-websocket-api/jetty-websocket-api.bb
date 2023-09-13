SUMMARY = "The websocket-api module for Jetty"
DESCRIPTION = "%{extdesc} The websocket-api module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.51"

RPM_NAME = "jetty-websocket-api-9.4.51-2.1.noarch.rpm"
RPM_HASH = "6cdb3872d003b788f21133ee1c72590534ca7503210f678f46d9efc62b4a1184cd6e1bbce117b097f087598e077796d25cc933749c9e35bb27bc77233b3d8158"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-websocket-api \
mvn-org.eclipse.jetty.websocket-websocket-api \
mvn-org.eclipse.jetty.websocket-websocket-api-pom- \
osgi-org.eclipse.jetty.websocket.api"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
