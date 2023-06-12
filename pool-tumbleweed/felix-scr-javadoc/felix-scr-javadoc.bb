SUMMARY = "Javadoc for felix-scr"
DESCRIPTION = "This package contains javadoc for felix-scr."
LICENSE = "Apache-2.0"

PV = "2.1.16"

RPM_NAME = "felix-scr-javadoc-2.1.16-1.18.noarch.rpm"
RPM_HASH = "70007dea4aee60dd37548ddc6ee2a0929248cd6cacc721f974e65c7a112d2044e2ae958001d50a6dfb31a267e0535f90ffbbd4c543103f498935cdf9ce5c34d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "felix-scr-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
