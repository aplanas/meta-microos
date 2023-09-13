SUMMARY = "The javax-websocket-client-impl module for Jetty"
DESCRIPTION = "%{extdesc} The javax-websocket-client-impl module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.51"

RPM_NAME = "jetty-javax-websocket-client-impl-9.4.51-2.1.noarch.rpm"
RPM_HASH = "ffee11b0df14b8d17d40f76e786ba778183c53c6b8f91d7f92c38301e451d63dcccdc396fd713e9a32d5dde894af9df09d5f19f6c5133bb89d1638e6d00f1209"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-javax-websocket-client-impl \
mvn-org.eclipse.jetty.websocket-javax-websocket-client-impl \
mvn-org.eclipse.jetty.websocket-javax-websocket-client-impl-pom- \
osgi-org.eclipse.jetty.websocket.javax.websocket"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-javax.websocket-javax.websocket-client-api \
mvn-org.eclipse.jetty.websocket-websocket-client"

inherit rpm
