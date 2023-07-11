SUMMARY = "Classes to manage report plugin executions with Maven 3"
DESCRIPTION = "Classes to manage and configure report plugin executions with Maven 3."
LICENSE = "Apache-2.0"

PV = "1.6.0"

RPM_NAME = "maven-reporting-exec-1.6.0-1.11.noarch.rpm"
RPM_HASH = "05003fb0a50ef109e0b080b2b811f9b1904dfbf740669fa40253ab47c42c8c456430b5f4b270d8743d966db26df964f7683c6f92b9ef50e8b31ddd6a60b5e70f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-reporting-exec \
mvn-org.apache.maven.reporting-maven-reporting-exec \
mvn-org.apache.maven.reporting-maven-reporting-exec-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven-maven-artifact \
mvn-org.apache.maven-maven-core \
mvn-org.apache.maven-maven-model \
mvn-org.apache.maven-maven-plugin-api \
mvn-org.apache.maven-maven-settings \
mvn-org.apache.maven-maven-settings-builder \
mvn-org.apache.maven.reporting-maven-reporting-api \
mvn-org.apache.maven.shared-maven-shared-utils \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.eclipse.aether-aether-util"

inherit rpm
