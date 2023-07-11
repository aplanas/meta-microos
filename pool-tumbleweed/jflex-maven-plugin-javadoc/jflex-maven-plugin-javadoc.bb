SUMMARY = "API documentation for jflex-maven-plugin"
DESCRIPTION = "This package provides API documentation for jflex-maven-plugin."
LICENSE = "BSD-3-Clause"

PV = "1.8.2"

RPM_NAME = "jflex-maven-plugin-javadoc-1.8.2-1.8.noarch.rpm"
RPM_HASH = "7e4bb65d80e4d362d3f45f781fd63e0aa6ed494b41aed2a9ce2b0d69ecfd5423088726c8ff267ae06ef4538ff2ac796934fc5516836c4d9f9431f9affdab97b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jflex-maven-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
