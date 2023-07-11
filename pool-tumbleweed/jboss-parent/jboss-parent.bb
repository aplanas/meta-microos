SUMMARY = "JBoss Parent POM"
DESCRIPTION = "The Project Object Model files for JBoss packages."
LICENSE = "CC0-1.0"

PV = "20"

RPM_NAME = "jboss-parent-20-1.21.noarch.rpm"
RPM_HASH = "1eea3955cfc5e6f97f2361394e396aa8f5004db4939e226c893eb430df9e658cf944177df99b288da4703fbf21441427b68641cd537cc41a4453c2d4b4507f74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jboss-parent \
mvn-org.jboss-jboss-parent-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven.plugins-maven-source-plugin"

inherit rpm
