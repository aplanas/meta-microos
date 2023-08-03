SUMMARY = "Maven Beanshell Mojo Support"
DESCRIPTION = "This package provides Maven Beanshell Mojo Support, which write Maven plugins with \
Beanshell scripts."
LICENSE = "Apache-2.0"

PV = "3.6.0"

RPM_NAME = "maven-script-beanshell-3.6.0-6.1.noarch.rpm"
RPM_HASH = "b227486f047e304e6117c811cf224e77e897d2185162c5e8f1a951d2b16c5a7d41d0e027fa346bfb7e5245b66b89847c77542177b494f62d90e55df42cf1ecb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-script-beanshell \
mvn-org.apache.maven.plugin-tools-maven-script-beanshell \
mvn-org.apache.maven.plugin-tools-maven-script-beanshell-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven-maven-plugin-api \
mvn-org.codehaus.plexus-plexus-bsh-factory"

inherit rpm
