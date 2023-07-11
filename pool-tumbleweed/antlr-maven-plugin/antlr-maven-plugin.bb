SUMMARY = "Maven plugin that generates files based on grammar file(s)"
DESCRIPTION = "The Antlr Plugin has two goals: \
- antlr:generate Generates file(s) to a target directory based on grammar \
  file(s). \
- antlr:html Generates Antlr report for grammar file(s)."
LICENSE = "Apache-2.0"

PV = "2.2"

RPM_NAME = "antlr-maven-plugin-2.2-3.11.noarch.rpm"
RPM_HASH = "5e5319ee32b53d81322adb4c0c03cabf95ae91dd5f1189a5139faee1a9dc79e6e888638ae472a930dc03ba1ac6c1bb500ebec2ddff9be17d583cf7d3f3e8b7ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "antlr-maven-plugin \
mvn-org.codehaus.mojo-antlr-maven-plugin \
mvn-org.codehaus.mojo-antlr-maven-plugin-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.commons-commons-exec \
mvn-org.apache.maven-maven-plugin-api \
mvn-org.apache.maven-maven-project \
mvn-org.apache.maven.reporting-maven-reporting-impl \
mvn-org.apache.maven.wagon-wagon-provider-api \
mvn-org.codehaus.plexus-plexus-i18n \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
