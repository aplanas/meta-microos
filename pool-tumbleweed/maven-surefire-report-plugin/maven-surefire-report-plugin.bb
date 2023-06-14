SUMMARY = "Surefire reports plugin for maven"
DESCRIPTION = "Plugin for generating reports from surefire test runs."
LICENSE = "Apache-2.0 & CPL-1.0"

PV = "2.22.0"

RPM_NAME = "maven-surefire-report-plugin-2.22.0-8.1.noarch.rpm"
RPM_HASH = "dff2415181ce95a1124dd239d4cc6382ece380f4de2558442c64cdfa21be4ce48b1291d4c1ccd07162e26ef32d35ce962086fd63823e7f96f0f1581e59debcf5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-surefire-report-plugin \
mvn-org.apache.maven.plugins-maven-surefire-report-plugin \
mvn-org.apache.maven.plugins-maven-surefire-report-plugin-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven-maven-model \
mvn-org.apache.maven-maven-plugin-api \
mvn-org.apache.maven.doxia-doxia-site-renderer \
mvn-org.apache.maven.plugin-tools-maven-plugin-annotations \
mvn-org.apache.maven.reporting-maven-reporting-impl \
mvn-org.apache.maven.surefire-surefire-report-parser \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
