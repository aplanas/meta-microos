SUMMARY = "The javax-websocket-server-impl module for Jetty"
DESCRIPTION = "%{extdesc} The javax-websocket-server-impl module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.51"

RPM_NAME = "jetty-javax-websocket-server-impl-9.4.51-1.2.noarch.rpm"
RPM_HASH = "93885ebf1d8281c79f1aff515ce9858db7b351e7ae8cd2884c5bfeb1f7f694df638fce7e64733286c09a49b4538928784d889dd48a6a2b8e8c4cf11cc84645d3"
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
