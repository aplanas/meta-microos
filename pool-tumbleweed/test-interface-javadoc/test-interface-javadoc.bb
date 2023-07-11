SUMMARY = "Javadoc for test-interface"
DESCRIPTION = "Javadoc for test-interface."
LICENSE = "BSD-3-Clause"

PV = "1.0"

RPM_NAME = "test-interface-javadoc-1.0-2.6.noarch.rpm"
RPM_HASH = "e805346ebc347633e21b767000930e147a1680112bdaed200c4c40b14c06811392e2f3417debccf1d0eb8e469852d638a7b9201709239c65e0ad80997316ef60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "test-interface-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
