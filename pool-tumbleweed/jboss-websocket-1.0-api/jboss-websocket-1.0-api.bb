SUMMARY = "JSR-356: Java WebSocket 1.0 API"
DESCRIPTION = "The JSR-356: Java WebSocket 1.0 API classes."
LICENSE = "CDDL-1.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "1.0.0"

RPM_NAME = "jboss-websocket-1.0-api-1.0.0-2.11.noarch.rpm"
RPM_HASH = "7472046cce0d80cb135e1f08bb5de805cb299276f36f0853cd69f4d7f4d29f73a5ec97c360fa41f6b9e91e0ad941a5161703daa1279dc4047514053f4aaab6f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jboss-websocket-1.0-api \
mvn-javax.websocket-javax.websocket-api \
mvn-javax.websocket-javax.websocket-api-pom- \
mvn-javax.websocket-javax.websocket-client-api \
mvn-javax.websocket-javax.websocket-client-api-pom- \
mvn-org.jboss.spec.javax.websocket-jboss-websocket-api-1.0-spec \
mvn-org.jboss.spec.javax.websocket-jboss-websocket-api-1.0-spec-pom- \
osgi-org.jboss.spec.javax.websocket.jboss-websocket-api-1.0-spec"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
