SUMMARY = "JSR-356: Java WebSocket 1.0 API"
DESCRIPTION = "The JSR-356: Java WebSocket 1.0 API classes."
LICENSE = "CDDL-1.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "1.0.0"

RPM_NAME = "jboss-websocket-1.0-api-1.0.0-3.1.noarch.rpm"
RPM_HASH = "54ce2be0975912e8114bd86c1b6a5ab1ab55e7ca191e6c8a5369b66c8bb9fd12b46d57cc74743b16dcafc60f619f1b1f90b33de73f6f0e964e6e1724cc7093a5"
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
