SUMMARY = "A library focused on algorithms working on strings"
DESCRIPTION = "Apache Commons Text is a library focused on algorithms working on strings."
LICENSE = "Apache-2.0"

PV = "1.10.0"

RPM_NAME = "apache-commons-text-1.10.0-2.2.noarch.rpm"
RPM_HASH = "43400675e8e53cfca8ec84170644d777ad0b3bea30d8643345ce86d486d1b800d6b9d658f00730c040877c11e10e7a4769e046a7b83eb240274b7be86b71e62e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-text \
mvn(org.apache.commons:commons-text) \
mvn(org.apache.commons:commons-text:pom:) \
osgi(org.apache.commons.commons-text)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.apache.commons:commons-lang3)"

inherit rpm
