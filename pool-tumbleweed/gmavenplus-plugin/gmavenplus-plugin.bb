SUMMARY = "Integrates Groovy into Maven projects"
DESCRIPTION = "GMavenPlus is a rewrite of GMaven, a Maven plugin \
that allows you to integrate Groovy into your \
Maven projects."
LICENSE = "Apache-2.0"

PV = "1.13.1"

RPM_NAME = "gmavenplus-plugin-1.13.1-1.14.noarch.rpm"
RPM_HASH = "695ef04ba3011f0df5b44e57ecc1ea62c6f93811dd58f2bbcc69f3a78feb20385230849cf691024b6704f405b2a512f4dfba06b750a62f76f51d798a3c1d4a22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gmavenplus-plugin \
mvn(org.codehaus.gmavenplus:gmavenplus-plugin) \
mvn(org.codehaus.gmavenplus:gmavenplus-plugin:pom:)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(jline:jline) \
mvn(org.apache.ant:ant) \
mvn(org.apache.ivy:ivy) \
mvn(org.apache.maven.shared:file-management) \
mvn(org.apache.maven:maven-archiver) \
mvn(org.apache.maven:maven-core) \
mvn(org.apache.maven:maven-model) \
mvn(org.apache.maven:maven-plugin-api) \
mvn(org.fusesource.jansi:jansi)"

inherit rpm
