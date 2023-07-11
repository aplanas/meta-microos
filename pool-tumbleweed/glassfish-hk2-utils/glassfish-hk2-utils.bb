SUMMARY = "HK2 Implementation Utilities"
DESCRIPTION = "Hundred Kilobytes Kernel Implementation Utilities."
LICENSE = "EPL-2.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.5.0"

RPM_NAME = "glassfish-hk2-utils-2.5.0-2.4.noarch.rpm"
RPM_HASH = "5778eaa51a121f2d899155671d26d2889ab2e6e32ae356ed03b03c945fe30d7a987068afdbc77746a80bbbcc1b5298c7c6769fa1368b540af9044728a7a5b289"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-hk2-utils \
mvn-org.glassfish.hk2-hk2-utils \
mvn-org.glassfish.hk2-hk2-utils-pom- \
osgi-org.glassfish.hk2.utils"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-javax.annotation-javax.annotation-api \
mvn-javax.inject-javax.inject"

inherit rpm
