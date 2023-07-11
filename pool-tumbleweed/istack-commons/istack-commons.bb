SUMMARY = "Common code for some Glassfish projects"
DESCRIPTION = "Code shared between JAXP, JAXB, SAAJ, and JAX-WS projects."
LICENSE = "CDDL-1.1 & GPL-2.0-only-with-Classpath-exception-2.0"

PV = "3.0.7"

RPM_NAME = "istack-commons-3.0.7-4.5.noarch.rpm"
RPM_HASH = "76c0a0c4995fe9131b28f342793e66e0f36ea0598ffd9a509dcf24b8b95ece23f186f00de10e886873d9da5677a707a080b9e5027620b604e8f0a3c3c33cf3f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "istack-commons \
mvn-com.sun.istack-istack-commons-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-net.java-jvnet-parent-pom- \
mvn-org.apache.felix-maven-bundle-plugin"

inherit rpm
