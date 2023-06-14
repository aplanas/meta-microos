SUMMARY = "Maven plugin that generates files based on grammar file(s)"
DESCRIPTION = "The Antlr Plugin has two goals: \
- antlr:generate Generates file(s) to a target directory based on grammar \
  file(s). \
- antlr:html Generates Antlr report for grammar file(s)."
LICENSE = "Apache-2.0"

PV = "2.2"

RPM_NAME = "antlr-maven-plugin-2.2-3.10.noarch.rpm"
RPM_HASH = "209b69dd23642e2eed77dfe1733cc6b656c58ef17d251113924ff02d1397bcd0626bab0a7c33aa9fff31df5073f7564c6bdd4f1a38235a21ab01b33850134462"
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
