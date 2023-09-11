SUMMARY = "Maven Plugin Metadata Model"
DESCRIPTION = "The Maven Plugin Metadata Model provides an API to play with the Metadata \
model."
LICENSE = "Apache-2.0"

PV = "3.6.0"

RPM_NAME = "maven-plugin-tools-model-3.6.0-7.1.noarch.rpm"
RPM_HASH = "c75e5991289c9c62a42500cad417c39da68f3fd3873adf449f6b1e47e1f45ee7186b740528cb566a3a5cc092d82dc742b1232ec2e20dfd4ee72647f906998f58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-plugin-tools-model \
mvn-org.apache.maven.plugin-tools-maven-plugin-tools-model \
mvn-org.apache.maven.plugin-tools-maven-plugin-tools-model-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven-maven-plugin-api \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
