SUMMARY = "HK2 configuration modules"
DESCRIPTION = "Hundred Kilobytes Kernel configuration modules."
LICENSE = "EPL-2.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.5.0"

RPM_NAME = "glassfish-hk2-configuration-2.5.0-4.1.noarch.rpm"
RPM_HASH = "05ca7b3be2beaa55ff1136c64fd267113a86196745bb29c221bc69a7b3b1644dda83331003e0abb86f690c1b5064eac7cb7c26ce300d87b243711686c0c692eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-hk2-configuration \
mvn-org.glassfish.hk2-hk2-configuration-hub \
mvn-org.glassfish.hk2-hk2-configuration-hub-pom- \
mvn-org.glassfish.hk2-hk2-configuration-integration \
mvn-org.glassfish.hk2-hk2-configuration-integration-pom- \
mvn-org.glassfish.hk2-hk2-configuration-persistence-pom- \
mvn-org.glassfish.hk2-hk2-configuration-pom- \
mvn-org.glassfish.hk2-hk2-property-file \
mvn-org.glassfish.hk2-hk2-property-file-pom- \
osgi-org.glassfish.hk2.configuration-hub \
osgi-org.glassfish.hk2.configuration-integration \
osgi-org.glassfish.hk2.property-file"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-javax.annotation-javax.annotation-api \
mvn-org.glassfish.hk2-hk2-api \
mvn-org.glassfish.hk2-hk2-locator \
mvn-org.glassfish.hk2-hk2-utils"

inherit rpm
