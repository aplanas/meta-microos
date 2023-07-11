SUMMARY = "Javadoc for tagsoup"
DESCRIPTION = "Javadoc package for tagsoup."
LICENSE = "Apache-2.0"

PV = "1.2.1"

RPM_NAME = "tagsoup-javadoc-1.2.1-5.4.noarch.rpm"
RPM_HASH = "b7ede7f260807e10c2d350a3e120818b2aad605d2d3659923c00a82a5fbe9b6598b03a511bf275dcc77db4e7246bbb046e050b2ba137999c9ad8c198faca9656"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tagsoup-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
