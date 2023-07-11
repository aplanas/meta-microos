SUMMARY = "JSR 356: Java API for WebSocket"
DESCRIPTION = "Java API for WebSocket JSR will define a standard API for \
creating web socket applications."
LICENSE = "CDDL-1.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "1.1"

RPM_NAME = "glassfish-websocket-api-1.1-2.11.noarch.rpm"
RPM_HASH = "04f0e198f71910f9d6f80a0872ea140584f4e21a0c499d0e5178c1e173fa5852e9d1ed8eb6aefc713225283c3fa676eef7d0e2c9c70124398bc1efee9e86ab25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-websocket-api \
mvn-javax.websocket-javax.websocket-all-pom- \
mvn-javax.websocket-javax.websocket-api \
mvn-javax.websocket-javax.websocket-api-pom- \
mvn-javax.websocket-javax.websocket-client-api \
mvn-javax.websocket-javax.websocket-client-api-pom- \
osgi-jakarta.websocket-api \
osgi-javax.websocket.javax.websocket-client-api"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
