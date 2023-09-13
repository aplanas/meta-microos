SUMMARY = "Prometheus Java Suite parent pom"
DESCRIPTION = "The Prometheus Java Suite: Client Metrics, Exposition, and Examples."
LICENSE = "Apache-2.0 & CC0-1.0"

PV = "0.8.0"

RPM_NAME = "prometheus-simpleclient-java-parent-0.8.0-7.1.noarch.rpm"
RPM_HASH = "4257d491505fd061f969fd9f05bed3a51ac6c0000272f35abbf570c4a39fefe0b5f22541fd30e9ac48b285b1dc3a6c4bafe9fb436b8d1bc004ced3301b01201c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-io.prometheus-parent-pom- \
prometheus-simpleclient-java-parent"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.felix-maven-bundle-plugin \
mvn-org.apache.maven.plugins-maven-compiler-plugin \
mvn-org.apache.maven.plugins-maven-javadoc-plugin \
mvn-org.apache.maven.plugins-maven-surefire-plugin \
mvn-org.sonatype.oss-oss-parent-pom-"

inherit rpm
