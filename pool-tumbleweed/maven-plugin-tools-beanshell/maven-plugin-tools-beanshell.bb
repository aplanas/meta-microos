SUMMARY = "Maven Plugin Tool for Beanshell"
DESCRIPTION = "Descriptor extractor for plugins written in Beanshell."
LICENSE = "Apache-2.0"

PV = "3.6.0"

RPM_NAME = "maven-plugin-tools-beanshell-3.6.0-6.1.noarch.rpm"
RPM_HASH = "f74a807abd5daec07169686d634e33a0878191a9ba3b53e6b99a7f28d56e4ca1dc2847aa87b71a39acc3e2609e8d3d662bbaefdc8fcb57e1f9baf648f213fac7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-plugin-tools-beanshell \
mvn-org.apache.maven.plugin-tools-maven-plugin-tools-beanshell \
mvn-org.apache.maven.plugin-tools-maven-plugin-tools-beanshell-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven.plugin-tools-maven-plugin-tools-api \
mvn-org.beanshell-bsh \
mvn-org.codehaus.plexus-plexus-component-annotations"

inherit rpm
