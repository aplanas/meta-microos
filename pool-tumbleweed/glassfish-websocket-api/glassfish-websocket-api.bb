SUMMARY = "JSR 356: Java API for WebSocket"
DESCRIPTION = "Java API for WebSocket JSR will define a standard API for \
creating web socket applications."
LICENSE = "CDDL-1.0 | GPL-2.0-only-WITH-Classpath-exception-2.0"

PV = "1.1"

RPM_NAME = "glassfish-websocket-api-1.1-2.10.noarch.rpm"
RPM_HASH = "7d01f28b22bca8b8b4df7fe7d097495aab03fd3f88eee07c94abe4a40bf2d29981dba71f1eee8521140dde77822cb08b83b389e9e95148a76d7717804c812679"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-websocket-api \
mvn(javax.websocket:javax.websocket-all:pom:) \
mvn(javax.websocket:javax.websocket-api) \
mvn(javax.websocket:javax.websocket-api:pom:) \
mvn(javax.websocket:javax.websocket-client-api) \
mvn(javax.websocket:javax.websocket-client-api:pom:) \
osgi(jakarta.websocket-api) \
osgi(javax.websocket.javax.websocket-client-api)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
