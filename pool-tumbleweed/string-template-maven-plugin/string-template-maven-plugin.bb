SUMMARY = "StringTemplate Maven Plugin"
DESCRIPTION = "This plugin allows to execute StringTemplate template files during build. \
The values for templates can come from static declarations or from a Java \
class specified to be executed."
LICENSE = "MIT"

PV = "1.1"

RPM_NAME = "string-template-maven-plugin-1.1-2.10.noarch.rpm"
RPM_HASH = "34dae38b69f2e2934faa8d46f04a361f2392dc33ebf81d554d47f75f8c058aae0c0c2cf8cb34a6a23f129f6c30612b526360c7a1315c29d95b5a022e645ca5c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(com.webguys:string-template-maven-plugin) \
mvn(com.webguys:string-template-maven-plugin:pom:) \
string-template-maven-plugin"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.antlr:ST4) \
mvn(org.apache.maven:maven-artifact) \
mvn(org.apache.maven:maven-core) \
mvn(org.apache.maven:maven-plugin-api) \
mvn(org.eclipse.aether:aether-util) \
mvn(org.twdata.maven:mojo-executor)"

inherit rpm
