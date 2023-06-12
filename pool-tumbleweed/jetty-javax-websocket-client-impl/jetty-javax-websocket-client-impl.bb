SUMMARY = "The javax-websocket-client-impl module for Jetty"
DESCRIPTION = "%{extdesc} The javax-websocket-client-impl module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.51"

RPM_NAME = "jetty-javax-websocket-client-impl-9.4.51-1.1.noarch.rpm"
RPM_HASH = "bf214a48e1457893447c425d4b36efe8eb0ed8881a473e5b2f10b5ed8abadbd89e5a6a5860956d6979a9f9c6e35fa787d94cd7f0fc1c6baa88bfb54cae491ba0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-javax-websocket-client-impl \
mvn(org.eclipse.jetty.websocket:javax-websocket-client-impl) \
mvn(org.eclipse.jetty.websocket:javax-websocket-client-impl:pom:) \
osgi(org.eclipse.jetty.websocket.javax.websocket)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(javax.websocket:javax.websocket-client-api) \
mvn(org.eclipse.jetty.websocket:websocket-client)"

inherit rpm
