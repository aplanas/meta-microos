SUMMARY = "Javadoc for paranamer"
DESCRIPTION = "This package contains the API documentation for paranamer."
LICENSE = "BSD-3-Clause"

PV = "2.8"

RPM_NAME = "paranamer-javadoc-2.8-2.10.noarch.rpm"
RPM_HASH = "31a887b87fa28dcfc749611ca9a697e0997ee4464e936262dbf087c53013085bba16bf6b537839b2054493fdb0710d7f10c809c2dd36a731d1cb4fe9fa7f3ea7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "paranamer-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
