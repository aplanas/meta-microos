SUMMARY = "Maven Beanshell Mojo Support"
DESCRIPTION = "This package provides Maven Beanshell Mojo Support, which write Maven plugins with \
Beanshell scripts."
LICENSE = "Apache-2.0"

PV = "3.6.0"

RPM_NAME = "maven-script-beanshell-3.6.0-7.1.noarch.rpm"
RPM_HASH = "b26a79c5bcc5c84b48c3bf41ff346251ef604809f6d4aad09e34b0f42dac8600f580f7fa28ac6815c2404b82a143e6ce08e88ea78379199e07a9c18507991c28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-script-beanshell \
mvn-org.apache.maven.plugin-tools-maven-script-beanshell \
mvn-org.apache.maven.plugin-tools-maven-script-beanshell-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven-maven-plugin-api \
mvn-org.codehaus.plexus-plexus-bsh-factory"

inherit rpm
