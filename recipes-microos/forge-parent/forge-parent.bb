SUMMARY = "Sonatype Forge Parent Pom"
DESCRIPTION = "Sonatype Forge is a community dedicated to the creation of \
development tools and technologies."
LICENSE = "Apache-2.0"

PV = "38"

RPM_NAME = "forge-parent-38-1.11.noarch.rpm"
RPM_HASH = "874f5a88c24a8bbca120b40a3c6102890fe3c210ea02a6f6f888086eb782998a10e34661d0874fa66a588cd9e349d17c01842933c662d2df00b371b2f7ad9a61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "forge-parent \
mvn(org.sonatype.forge:forge-parent:pom:)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
