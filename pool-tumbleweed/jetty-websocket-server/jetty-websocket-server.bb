SUMMARY = "The websocket-server module for Jetty"
DESCRIPTION = "%{extdesc} The websocket-server module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.51"

RPM_NAME = "jetty-websocket-server-9.4.51-1.2.noarch.rpm"
RPM_HASH = "b9675ddff5a1c19ee785daf2aa2ce418e9bd4d9ba4f3aeabc402f3a96755d85d55a2c7eabd63026a02121ec9847079e7276643b4af3941de377a93301ef2cef8"
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
