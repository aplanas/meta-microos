SUMMARY = "Enforcer Rules"
DESCRIPTION = "This component contains the standard Enforcer Rules."
LICENSE = "Apache-2.0"

PV = "1.4.1"

RPM_NAME = "maven-enforcer-plugin-1.4.1-3.10.noarch.rpm"
RPM_HASH = "9dd61936a7a2fb36c91387c43bb01fb2c5c9747a6d9305c3643bda8de65258a354789fa9b654edad240fa6cef7248ebecc57cb5aa95c0ba22dc665d6e5f8b871"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-enforcer-plugin \
mvn(org.apache.maven.plugins:maven-enforcer-plugin) \
mvn(org.apache.maven.plugins:maven-enforcer-plugin:pom:)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(commons-lang:commons-lang) \
mvn(org.apache.maven.enforcer:enforcer-api) \
mvn(org.apache.maven.enforcer:enforcer-rules) \
mvn(org.apache.maven.plugin-testing:maven-plugin-testing-harness) \
mvn(org.apache.maven:maven-artifact) \
mvn(org.apache.maven:maven-core) \
mvn(org.apache.maven:maven-plugin-api) \
mvn(org.codehaus.plexus:plexus-utils)"

inherit rpm
