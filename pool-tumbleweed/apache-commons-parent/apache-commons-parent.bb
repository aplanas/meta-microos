SUMMARY = "Apache Commons Parent Pom"
DESCRIPTION = "The Project Object Model files for the apache-commons packages."
LICENSE = "Apache-2.0"

PV = "53"

RPM_NAME = "apache-commons-parent-53-1.2.noarch.rpm"
RPM_HASH = "9568d10f80ede7020407f84f3f5a347a37ecb4b261e50b775239b02a23531f5d8aa3a74df8586b4c55c42d002a681443d35a980cecae51fb154f9e5dd84ebfa9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-parent \
mvn(org.apache.commons:commons-parent:pom:)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.apache.felix:maven-bundle-plugin) \
mvn(org.apache.maven.plugins:maven-antrun-plugin) \
mvn(org.apache.maven.plugins:maven-assembly-plugin) \
mvn(org.apache.maven.plugins:maven-compiler-plugin) \
mvn(org.apache.maven.plugins:maven-jar-plugin) \
mvn(org.apache.maven.plugins:maven-surefire-plugin) \
mvn(org.apache:apache:pom:) \
mvn(org.codehaus.mojo:build-helper-maven-plugin)"

inherit rpm
