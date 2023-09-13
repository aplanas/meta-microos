SUMMARY = "The websocket-server module for Jetty"
DESCRIPTION = "%{extdesc} The websocket-server module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.51"

RPM_NAME = "jetty-websocket-server-9.4.51-2.1.noarch.rpm"
RPM_HASH = "414701cff6c343204a314aa013a8a90537b45e978e1f1936e5790b8e425056fb182be1d1baf7a2695b9d6e9268ccb2063da5d3e73886b496947c505ed2e9d7d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-websocket-server \
mvn-org.eclipse.jetty.websocket-websocket-server \
mvn-org.eclipse.jetty.websocket-websocket-server-pom- \
osgi-org.eclipse.jetty.websocket.server"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.eclipse.jetty-jetty-http \
mvn-org.eclipse.jetty-jetty-servlet \
mvn-org.eclipse.jetty.websocket-websocket-client \
mvn-org.eclipse.jetty.websocket-websocket-common \
mvn-org.eclipse.jetty.websocket-websocket-servlet"

inherit rpm
