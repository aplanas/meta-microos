SUMMARY = "JSR 356: Java API for WebSocket"
DESCRIPTION = "Java API for WebSocket JSR will define a standard API for \
creating web socket applications."
LICENSE = "CDDL-1.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "1.1"

RPM_NAME = "glassfish-websocket-api-1.1-3.1.noarch.rpm"
RPM_HASH = "d7d86a75ff8ca02165e837563bdfa21085d100edd3e37660edc6cf2251b83584b08f481f5facf0e80a01015d2330405456017534c2fe0fb6ea897f461be7d33d"
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
