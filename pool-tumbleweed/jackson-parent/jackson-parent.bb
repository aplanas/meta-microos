SUMMARY = "Parent pom for all Jackson components"
DESCRIPTION = "Project for parent pom for all Jackson components."
LICENSE = "Apache-2.0"

PV = "2.13"

RPM_NAME = "jackson-parent-2.13-1.13.noarch.rpm"
RPM_HASH = "966b0fc929a899fff8f2b5cac42d5457fbbb05b0dcb4faea0aafdeb9cef119f44b6f784f519bd995f1528f8ff6b95e525574fe76213c5e833a61974a3ef88ad0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-parent \
mvn-com.fasterxml.jackson-jackson-parent-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml-oss-parent-pom-"

inherit rpm
