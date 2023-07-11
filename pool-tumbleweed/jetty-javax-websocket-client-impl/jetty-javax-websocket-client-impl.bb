SUMMARY = "The javax-websocket-client-impl module for Jetty"
DESCRIPTION = "%{extdesc} The javax-websocket-client-impl module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.51"

RPM_NAME = "jetty-javax-websocket-client-impl-9.4.51-1.2.noarch.rpm"
RPM_HASH = "6ae58c93125ed2f9b962feee12e3788600d5eb13187412da99a83013f63846b516abf732268f90d05628b053bd456b9f861c4a659f0d3044f8486670c4c2ef94"
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
