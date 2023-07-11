SUMMARY = "Surefire reports plugin for maven"
DESCRIPTION = "Plugin for generating reports from surefire test runs."
LICENSE = "Apache-2.0 & CPL-1.0"

PV = "2.22.0"

RPM_NAME = "maven-surefire-report-plugin-2.22.0-8.2.noarch.rpm"
RPM_HASH = "511922fbc241ceebcf3a6fc71ac129cb749ccefea53bf9caddbaa396e9ddefb0f384fa3022d7cb36d9db8157e3e9650e96a1b2edf27886ef795ed95038c49741"
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
