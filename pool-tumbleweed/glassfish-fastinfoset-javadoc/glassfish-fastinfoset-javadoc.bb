SUMMARY = "Javadoc for glassfish-fastinfoset"
DESCRIPTION = "This package contains javadoc for glassfish-fastinfoset."
LICENSE = "Apache-2.0"

PV = "1.2.15"

RPM_NAME = "glassfish-fastinfoset-javadoc-1.2.15-6.1.noarch.rpm"
RPM_HASH = "2a11ef5d2ac85ed7b706d5baacb3e0ab905f128e192df1af8a6d67671bf55d31b2abc4a68d8c1a2aa328fac4ab81cf5eef350e27354506e7046e08df1bfe0435"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-fastinfoset-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
