SUMMARY = "The websocket-server module for Jetty"
DESCRIPTION = "%{extdesc} The websocket-server module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.51"

RPM_NAME = "jetty-websocket-server-9.4.51-1.1.noarch.rpm"
RPM_HASH = "912e514be5e7450317a044ab14b5af04e1232978611106462939e1a2ffef423901d7414ac91f39d0fb8bdf0e171586f9fc3174afb5bc1a395dab6402811dcb24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-websocket-server \
mvn(org.eclipse.jetty.websocket:websocket-server) \
mvn(org.eclipse.jetty.websocket:websocket-server:pom:) \
osgi(org.eclipse.jetty.websocket.server)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.eclipse.jetty.websocket:websocket-client) \
mvn(org.eclipse.jetty.websocket:websocket-common) \
mvn(org.eclipse.jetty.websocket:websocket-servlet) \
mvn(org.eclipse.jetty:jetty-http) \
mvn(org.eclipse.jetty:jetty-servlet)"

inherit rpm
