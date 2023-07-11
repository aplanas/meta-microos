SUMMARY = "Java JTA 1.3 API Design Specification"
DESCRIPTION = "Project GlassFish Java Transaction API."
LICENSE = "CDDL-1.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "1.3"

RPM_NAME = "glassfish-transaction-api-1.3-3.11.noarch.rpm"
RPM_HASH = "8c6d508d73203dc829342283a1098b62eff8964f80190f0d28b45fc2d2a278007c541536614a5294367ae708b4a375d030edfc4702dd6026a2a5db2df6583ee5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-transaction-api \
mvn-javax.transaction-javax.transaction-api \
mvn-javax.transaction-javax.transaction-api-pom- \
osgi-javax.transaction-api"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
