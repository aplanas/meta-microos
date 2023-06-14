SUMMARY = "The javax-websocket-server-impl module for Jetty"
DESCRIPTION = "%{extdesc} The javax-websocket-server-impl module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.51"

RPM_NAME = "jetty-javax-websocket-server-impl-9.4.51-1.1.noarch.rpm"
RPM_HASH = "0f5c6cb4adce6d2567b8cef0b3a2603af3a773dd01d3cd7fe0ca6b58fa60003068ce5e111645996955f86ac72e1e5860739bb5ca1163bd893623135e9ef848be"
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
