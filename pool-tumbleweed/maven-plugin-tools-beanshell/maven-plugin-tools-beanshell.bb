SUMMARY = "Maven Plugin Tool for Beanshell"
DESCRIPTION = "Descriptor extractor for plugins written in Beanshell."
LICENSE = "Apache-2.0"

PV = "3.6.0"

RPM_NAME = "maven-plugin-tools-beanshell-3.6.0-5.1.noarch.rpm"
RPM_HASH = "eea40d2aa7d20febe6cdb480d354021764bd402591ff95daaed7881b3cf45d7f93d23440ec75b1d112a8bc6913f983cdd4a3ed148491d110044d9eda786e5939"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-plugin-tools-beanshell \
mvn(org.apache.maven.plugin-tools:maven-plugin-tools-beanshell) \
mvn(org.apache.maven.plugin-tools:maven-plugin-tools-beanshell:pom:)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.apache.maven.plugin-tools:maven-plugin-tools-api) \
mvn(org.beanshell:bsh) \
mvn(org.codehaus.plexus:plexus-component-annotations)"

inherit rpm
