SUMMARY = "Maven plugin to remove generated files"
DESCRIPTION = "The Maven Clean Plugin is a plugin that removes files generated \
at build-time in a project's directory."
LICENSE = "Apache-2.0"

PV = "3.1.0"

RPM_NAME = "maven-clean-plugin-3.1.0-4.11.noarch.rpm"
RPM_HASH = "109e02f07089913b6ac119eca1c9e5a362ab6296aea07270df74dee324ac0025c34acf814ebe59ec329fc5faebd4777e4163a0b719fb9ed2a47217503e4276bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-clean-plugin \
mvn-org.apache.maven.plugins-maven-clean-plugin \
mvn-org.apache.maven.plugins-maven-clean-plugin-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven-maven-plugin-api \
mvn-org.apache.maven.shared-maven-shared-utils"

inherit rpm
