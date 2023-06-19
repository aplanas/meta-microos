SUMMARY = "Common code for some Glassfish projects"
DESCRIPTION = "Code shared between JAXP, JAXB, SAAJ, and JAX-WS projects."
LICENSE = "CDDL-1.1 & GPL-2.0-only-with-Classpath-exception-2.0"

PV = "3.0.7"

RPM_NAME = "istack-commons-3.0.7-4.4.noarch.rpm"
RPM_HASH = "315e3f0574ecf98ad8fc95541f5c3fe0b4dea11e9eb3026e2f84556190ef2b535374719c14e667e1487da7a3812f4073795b549fcd37003244aecad0a51626de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "istack-commons \
mvn-com.sun.istack-istack-commons-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-net.java-jvnet-parent-pom- \
mvn-org.apache.felix-maven-bundle-plugin"

inherit rpm
