SUMMARY = "Javadoc for hsqldb"
DESCRIPTION = "Javadoc for hsqldb."
LICENSE = "BSD-3-Clause"

PV = "2.7.2"

RPM_NAME = "hsqldb-javadoc-2.7.2-1.1.noarch.rpm"
RPM_HASH = "7a249b5b8674374e9e3c68653e9e2972b122f6b4eea0dd8ee1d68ff0c3d3263c359afc19361abf39434bada22c67f8b49f57a9861388ee5baaaa97f547995e4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hsqldb-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
