SUMMARY = "Maven Beanshell Mojo Support"
DESCRIPTION = "This package provides Maven Beanshell Mojo Support, which write Maven plugins with \
Beanshell scripts."
LICENSE = "Apache-2.0"

PV = "3.6.0"

RPM_NAME = "maven-script-beanshell-3.6.0-5.2.noarch.rpm"
RPM_HASH = "36cdf7a74c927251d1f8b1365250d43b57494ea7b25228d00dd3417d605815ebf2bdc148d1170ccb844f0c105433468e6863ae31e03c7534adf180601330f6e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-script-beanshell \
mvn-org.apache.maven.plugin-tools-maven-script-beanshell \
mvn-org.apache.maven.plugin-tools-maven-script-beanshell-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven-maven-plugin-api \
mvn-org.codehaus.plexus-plexus-bsh-factory"

inherit rpm
