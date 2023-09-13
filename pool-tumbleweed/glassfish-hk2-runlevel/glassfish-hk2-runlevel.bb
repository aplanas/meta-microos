SUMMARY = "HK2 Run Level Service"
DESCRIPTION = "Hundred Kilobytes Kernel Run Level Service."
LICENSE = "EPL-2.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.5.0"

RPM_NAME = "glassfish-hk2-runlevel-2.5.0-4.1.noarch.rpm"
RPM_HASH = "3d54c3f9fef3d81fa4cad4e8c9c4ea76ac6bd81f48e3a4a70a9ee5431f6a3b8016bc984d49ad53501bcfba9729c99b08e497a2dcd8bfcfbd794e28f365e64e31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-hk2-runlevel \
mvn-org.glassfish.hk2-hk2-runlevel \
mvn-org.glassfish.hk2-hk2-runlevel-pom- \
osgi-org.glassfish.hk2.runlevel"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-javax.annotation-javax.annotation-api \
mvn-org.glassfish.hk2-hk2-api \
mvn-org.glassfish.hk2-hk2-locator"

inherit rpm
