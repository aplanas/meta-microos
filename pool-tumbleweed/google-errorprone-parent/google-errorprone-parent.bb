SUMMARY = "Error Prone parent POM"
DESCRIPTION = "Error Prone is a static analysis tool for Java that catches \
common programming mistakes at compile-time."
LICENSE = "Apache-2.0"

PV = "2.11.0"

RPM_NAME = "google-errorprone-parent-2.11.0-2.2.noarch.rpm"
RPM_HASH = "70582e521b1b181e949e8d3eae2ca782931818c2900e6e0cc0f315d342a3f36b643b43ca2e52268d821b58bb286450126a9737a6de47b5cd4bab2657879b0ca3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-errorprone-parent \
mvn-com.google.errorprone-error-prone-parent-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven.plugins-maven-compiler-plugin \
mvn-org.apache.maven.plugins-maven-jar-plugin \
mvn-org.apache.maven.plugins-maven-javadoc-plugin \
mvn-org.apache.maven.plugins-maven-surefire-plugin"

inherit rpm
