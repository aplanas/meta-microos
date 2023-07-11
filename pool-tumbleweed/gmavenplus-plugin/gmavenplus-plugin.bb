SUMMARY = "Integrates Groovy into Maven projects"
DESCRIPTION = "GMavenPlus is a rewrite of GMaven, a Maven plugin \
that allows you to integrate Groovy into your \
Maven projects."
LICENSE = "Apache-2.0"

PV = "1.13.1"

RPM_NAME = "gmavenplus-plugin-1.13.1-1.15.noarch.rpm"
RPM_HASH = "39d4f39bfc1c2ce65926f3b15728aea1aa32b3f9f7fcc030af20876869d42ff479e7c67269446e7c8cfba5ab46794a8bec84b1c75600caa977f97dbc2d069d17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gmavenplus-plugin \
mvn-org.codehaus.gmavenplus-gmavenplus-plugin \
mvn-org.codehaus.gmavenplus-gmavenplus-plugin-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-jline-jline \
mvn-org.apache.ant-ant \
mvn-org.apache.ivy-ivy \
mvn-org.apache.maven-maven-archiver \
mvn-org.apache.maven-maven-core \
mvn-org.apache.maven-maven-model \
mvn-org.apache.maven-maven-plugin-api \
mvn-org.apache.maven.shared-file-management \
mvn-org.fusesource.jansi-jansi"

inherit rpm
