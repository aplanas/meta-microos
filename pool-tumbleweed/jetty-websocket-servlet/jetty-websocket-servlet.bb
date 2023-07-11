SUMMARY = "The websocket-servlet module for Jetty"
DESCRIPTION = "%{extdesc} The websocket-servlet module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.51"

RPM_NAME = "jetty-websocket-servlet-9.4.51-1.2.noarch.rpm"
RPM_HASH = "347ef43211a21a8b8ad3a436cf1c777d3fb505f1a23a1e7f5fab218d4f3e0630338f2a615cbead4f198113543426fbb268072fadfed250e65fff72d1cac8a0a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-websocket-servlet \
mvn-org.eclipse.jetty.websocket-websocket-servlet \
mvn-org.eclipse.jetty.websocket-websocket-servlet-pom- \
osgi-org.eclipse.jetty.websocket.servlet"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-javax.servlet-javax.servlet-api \
mvn-org.eclipse.jetty.websocket-websocket-api"

inherit rpm
