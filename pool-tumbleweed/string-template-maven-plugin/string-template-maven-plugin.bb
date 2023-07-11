SUMMARY = "StringTemplate Maven Plugin"
DESCRIPTION = "This plugin allows to execute StringTemplate template files during build. \
The values for templates can come from static declarations or from a Java \
class specified to be executed."
LICENSE = "MIT"

PV = "1.1"

RPM_NAME = "string-template-maven-plugin-1.1-2.11.noarch.rpm"
RPM_HASH = "c27a7561b012d2fc96d1fead8e5cf35c2a59d97150959015e042ee96211640b5c62ef92eb01017b89fa18f19868d8c0dae936bb012945822630a44b96e06de60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-com.webguys-string-template-maven-plugin \
mvn-com.webguys-string-template-maven-plugin-pom- \
string-template-maven-plugin"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.antlr-ST4 \
mvn-org.apache.maven-maven-artifact \
mvn-org.apache.maven-maven-core \
mvn-org.apache.maven-maven-plugin-api \
mvn-org.eclipse.aether-aether-util \
mvn-org.twdata.maven-mojo-executor"

inherit rpm
