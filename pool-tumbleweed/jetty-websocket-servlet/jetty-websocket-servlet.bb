SUMMARY = "The websocket-servlet module for Jetty"
DESCRIPTION = "%{extdesc} The websocket-servlet module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.51"

RPM_NAME = "jetty-websocket-servlet-9.4.51-1.1.noarch.rpm"
RPM_HASH = "328d48a2372b3d62d3c3c589eaa0728d5b8cefa2e8c07429a9ada542ea79221be378fc66cec32cb940d252571deb62db77a482d8099d57df7e634153131369ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-websocket-servlet \
mvn(org.eclipse.jetty.websocket:websocket-servlet) \
mvn(org.eclipse.jetty.websocket:websocket-servlet:pom:) \
osgi(org.eclipse.jetty.websocket.servlet)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(javax.servlet:javax.servlet-api) \
mvn(org.eclipse.jetty.websocket:websocket-api)"

inherit rpm
