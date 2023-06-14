SUMMARY = "JBoss Parent POM"
DESCRIPTION = "The Project Object Model files for JBoss packages."
LICENSE = "CC0-1.0"

PV = "20"

RPM_NAME = "jboss-parent-20-1.20.noarch.rpm"
RPM_HASH = "136e263b69f73239e0a23a2eca85b1c9900998eafa0dca495018349daa5df33c6061e1928f32d87c12effb25a55c520c4e4063f44296048d8cc20cc37e518c76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jboss-parent \
mvn-org.jboss-jboss-parent-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven.plugins-maven-source-plugin"

inherit rpm
