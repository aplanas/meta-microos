SUMMARY = "Maven Plugin Tool for Beanshell"
DESCRIPTION = "Descriptor extractor for plugins written in Beanshell."
LICENSE = "Apache-2.0"

PV = "3.6.0"

RPM_NAME = "maven-plugin-tools-beanshell-3.6.0-7.1.noarch.rpm"
RPM_HASH = "843b906725b135f39325013d61a4d2163f45c7fe5193202131927754a934f9c8f3e64861d501a7a09dd9739abb3a1bd072388e0cd0b39412b71efc71a33d65a7"
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
