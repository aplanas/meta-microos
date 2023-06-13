SUMMARY = "Jetty build support files"
DESCRIPTION = "Build Support for Jetty. Contains enforcer rules, PMD rulesets, etc."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "1.5"

RPM_NAME = "jetty-build-support-1.5-2.9.noarch.rpm"
RPM_HASH = "1b7c4653db3b8b828946d34cc5f0e1fe774a1fa2f61aa7ada773bfff44c1b51a386049ea0e1ac53c030fb2b5dc33c95680355668d58f0b296e2f67af5aec7b43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-build-support \
mvn(org.eclipse.jetty.toolchain:jetty-build-support) \
mvn(org.eclipse.jetty.toolchain:jetty-build-support:pom:)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.apache.maven.enforcer:enforcer-api) \
mvn(org.apache.maven.plugins:maven-shade-plugin) \
mvn(org.apache.maven:maven-artifact) \
mvn(org.apache.maven:maven-core) \
mvn(org.apache.maven:maven-plugin-api) \
mvn(org.apache.maven:maven-project) \
mvn(org.codehaus.plexus:plexus-container-default) \
mvn(org.junit.jupiter:junit-jupiter-engine) \
mvn(org.junit.jupiter:junit-jupiter-params)"

inherit rpm
