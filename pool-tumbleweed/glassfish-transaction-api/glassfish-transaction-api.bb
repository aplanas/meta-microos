SUMMARY = "Java JTA 1.3 API Design Specification"
DESCRIPTION = "Project GlassFish Java Transaction API."
LICENSE = "CDDL-1.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "1.3"

RPM_NAME = "glassfish-transaction-api-1.3-4.1.noarch.rpm"
RPM_HASH = "3ebae18a2b8fa09ac0418bb822185e43deba5fa41bc300eecaf3d0834420f7c047f6989a9d948208494f34c5b4e88453fd259b0830d43e466d760df2ea3d03f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-transaction-api \
mvn-javax.transaction-javax.transaction-api \
mvn-javax.transaction-javax.transaction-api-pom- \
osgi-javax.transaction-api"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
