SUMMARY = "Prometheus Java Suite parent pom"
DESCRIPTION = "The Prometheus Java Suite: Client Metrics, Exposition, and Examples."
LICENSE = "Apache-2.0 & CC0-1.0"

PV = "0.8.0"

RPM_NAME = "prometheus-simpleclient-java-parent-0.8.0-6.11.noarch.rpm"
RPM_HASH = "35267817a83b52cf3a6ecfe0f83cd6381f0a0ec57dcc789ceff389656737a67406b0f3a2b2f994a44e151cd4da0620fc8596b92d7fe868541229d1839bc87da9"
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
