SUMMARY = "The javax-websocket-server-impl module for Jetty"
DESCRIPTION = "%{extdesc} The javax-websocket-server-impl module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.51"

RPM_NAME = "jetty-javax-websocket-server-impl-9.4.51-2.1.noarch.rpm"
RPM_HASH = "32a63ad74efdb939f9e9fc88c62a0fae8a465484a23333eab30e998523bdc42e5febf37c4c90e913bc7589b2a12f8a798648072ae533613e5e45a9a8d4c6081b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-javax-websocket-server-impl \
mvn-org.eclipse.jetty.websocket-javax-websocket-server-impl \
mvn-org.eclipse.jetty.websocket-javax-websocket-server-impl-pom- \
osgi-org.eclipse.jetty.websocket.javax.websocket.server"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-javax.websocket-javax.websocket-api \
mvn-org.eclipse.jetty-jetty-annotations \
mvn-org.eclipse.jetty.websocket-javax-websocket-client-impl \
mvn-org.eclipse.jetty.websocket-websocket-server"

inherit rpm
