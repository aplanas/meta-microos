SUMMARY = "Libraries for Embedding Apache Tomcat"
DESCRIPTION = "Embeddeding support (various libraries) for Apache Tomcat."
LICENSE = "Apache-2.0"

PV = "9.0.75"

RPM_NAME = "tomcat-embed-9.0.75-1.1.noarch.rpm"
RPM_HASH = "34672133f4ac36f2c379df5e63e25cdffa205309ea578a94bfc8dc9e8b62479188be28e0d02f560b643db88eff49054b460d2b65885798e2904d8d25e415204f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.apache.tomcat.embed:tomcat-embed-core) \
mvn(org.apache.tomcat.embed:tomcat-embed-core:pom:) \
mvn(org.apache.tomcat.embed:tomcat-embed-el) \
mvn(org.apache.tomcat.embed:tomcat-embed-el:pom:) \
mvn(org.apache.tomcat.embed:tomcat-embed-jasper) \
mvn(org.apache.tomcat.embed:tomcat-embed-jasper:pom:) \
mvn(org.apache.tomcat.embed:tomcat-embed-websocket) \
mvn(org.apache.tomcat.embed:tomcat-embed-websocket:pom:) \
osgi(org.apache.tomcat-embed-core) \
osgi(org.apache.tomcat-embed-jasper) \
osgi(org.apache.tomcat-embed-jasper-el) \
osgi(org.apache.tomcat-embed-websocket) \
tomcat-embed"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.apache.tomcat:tomcat-annotations-api) \
mvn(org.eclipse.jdt:ecj)"

inherit rpm
