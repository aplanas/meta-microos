SUMMARY = "Javadoc documentation for jsr-305"
DESCRIPTION = "This package contains the API documentation for jsr-305."
LICENSE = "BSD-3-Clause"

PV = "3.0.2"

RPM_NAME = "jsr-305-javadoc-3.0.2-2.7.noarch.rpm"
RPM_HASH = "3a0d6e28775359395dbf0cf205794d0c5d170bb6e3c18ac92d1ca6e3bc93632fac286761298b23161102f2400e08f11712afbb6b50fb52b9f848b6f2aa008835"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jsr-305-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
