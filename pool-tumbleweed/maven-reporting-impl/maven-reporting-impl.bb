SUMMARY = "Abstract classes to manage report generation"
DESCRIPTION = "Abstract classes to manage report generation, which can be run both: \
 \
* as part of a site generation (as a maven-reporting-api's MavenReport), \
* or as a direct standalone invocation (as a maven-plugin-api's Mojo). \
 \
This is a replacement package for maven-shared-reporting-impl"
LICENSE = "Apache-2.0"

PV = "3.1.0"

RPM_NAME = "maven-reporting-impl-3.1.0-2.1.noarch.rpm"
RPM_HASH = "f8055309e26c30417fdfea9225bfe0e1bd1cf94da04b18d3f49505a1d2541e2eee85b4c4a9ac762c3df8d75a9ecda314cc3e546d482cf4344309c025c6fc5dac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-reporting-impl \
mvn-org.apache.maven.reporting-maven-reporting-impl \
mvn-org.apache.maven.reporting-maven-reporting-impl-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven-maven-core \
mvn-org.apache.maven-maven-plugin-api \
mvn-org.apache.maven.doxia-doxia-core \
mvn-org.apache.maven.doxia-doxia-decoration-model \
mvn-org.apache.maven.doxia-doxia-sink-api \
mvn-org.apache.maven.doxia-doxia-site-renderer \
mvn-org.apache.maven.reporting-maven-reporting-api \
mvn-org.apache.maven.shared-maven-shared-utils \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
