SUMMARY = "Parent pom for all Jackson components"
DESCRIPTION = "Project for parent pom for all Jackson components."
LICENSE = "Apache-2.0"

PV = "2.13"

RPM_NAME = "jackson-parent-2.13-1.14.noarch.rpm"
RPM_HASH = "91a0cb01690d25a0d5f693dd29f5a54155548390707f2029d219914419f1e893a5004d864f2bb18feb14e8083f54c3694c688ff1a7607730d7ffe9cb10a04b5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-parent \
mvn-com.fasterxml.jackson-jackson-parent-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml-oss-parent-pom-"

inherit rpm
