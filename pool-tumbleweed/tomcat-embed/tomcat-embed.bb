SUMMARY = "Libraries for Embedding Apache Tomcat"
DESCRIPTION = "Embeddeding support (various libraries) for Apache Tomcat."
LICENSE = "Apache-2.0"

PV = "9.0.75"

RPM_NAME = "tomcat-embed-9.0.75-1.2.noarch.rpm"
RPM_HASH = "c7d9b737a09084c847b21c05dbcbe9dd2fe37f7d30ad16b8eb67c2ebf0b76d11370e58fad0552d0831e593711d0a585d532caa73519d80b2e88128279c81a2d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.apache.tomcat.embed-tomcat-embed-core \
mvn-org.apache.tomcat.embed-tomcat-embed-core-pom- \
mvn-org.apache.tomcat.embed-tomcat-embed-el \
mvn-org.apache.tomcat.embed-tomcat-embed-el-pom- \
mvn-org.apache.tomcat.embed-tomcat-embed-jasper \
mvn-org.apache.tomcat.embed-tomcat-embed-jasper-pom- \
mvn-org.apache.tomcat.embed-tomcat-embed-websocket \
mvn-org.apache.tomcat.embed-tomcat-embed-websocket-pom- \
osgi-org.apache.tomcat-embed-core \
osgi-org.apache.tomcat-embed-jasper \
osgi-org.apache.tomcat-embed-jasper-el \
osgi-org.apache.tomcat-embed-websocket \
tomcat-embed"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.tomcat-tomcat-annotations-api \
mvn-org.eclipse.jdt-ecj"

inherit rpm
