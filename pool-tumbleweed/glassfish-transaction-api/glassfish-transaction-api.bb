SUMMARY = "Java JTA 1.3 API Design Specification"
DESCRIPTION = "Project GlassFish Java Transaction API."
LICENSE = "CDDL-1.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "1.3"

RPM_NAME = "glassfish-transaction-api-1.3-3.10.noarch.rpm"
RPM_HASH = "157599dfbd7ac3ac48b5382bcfac19946c4640d60169d53d8e73001ad2ec1e1b80c6ea501d36a392452168af60087eea1fe06d5a0b2699f0b71f3c706379cbd1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-transaction-api \
mvn-javax.transaction-javax.transaction-api \
mvn-javax.transaction-javax.transaction-api-pom- \
osgi-javax.transaction-api"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
