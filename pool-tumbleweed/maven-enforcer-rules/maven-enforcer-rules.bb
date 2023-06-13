SUMMARY = "Enforcer Rules"
DESCRIPTION = "This component contains the standard Enforcer Rules."
LICENSE = "Apache-2.0"

PV = "1.4.1"

RPM_NAME = "maven-enforcer-rules-1.4.1-3.10.noarch.rpm"
RPM_HASH = "316f98f4c79611453c14754f80694b7c037500cf25379ef8857feed7ba2b297f4418c310a3a8682fb664b1ad828b8d7fb421c64351df2013ae64ebbb617bb4de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-enforcer-rules \
mvn(org.apache.maven.enforcer:enforcer-rules) \
mvn(org.apache.maven.enforcer:enforcer-rules:pom:)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(commons-lang:commons-lang) \
mvn(org.apache.maven.enforcer:enforcer-api) \
mvn(org.apache.maven.shared:maven-artifact-transfer) \
mvn(org.apache.maven.shared:maven-common-artifact-filters) \
mvn(org.apache.maven.shared:maven-dependency-tree) \
mvn(org.apache.maven:maven-artifact) \
mvn(org.apache.maven:maven-compat) \
mvn(org.apache.maven:maven-core) \
mvn(org.apache.maven:maven-plugin-api) \
mvn(org.beanshell:bsh) \
mvn(org.codehaus.plexus:plexus-i18n) \
mvn(org.codehaus.plexus:plexus-utils)"

inherit rpm
