SUMMARY = "Javadoc for jackson-annotations"
DESCRIPTION = "This package contains API documentation for jackson-annotations."
LICENSE = "Apache-2.0"

PV = "2.15.2"

RPM_NAME = "jackson-annotations-javadoc-2.15.2-1.1.noarch.rpm"
RPM_HASH = "3f4bd0982a14ead1c8e3a9f96baef9e689b651a828933302e840380a3c76df290f92210ffd0b8e12c9a7aadcef805c6f5ecc58124793aef831ba689de854a381"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-annotations-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
