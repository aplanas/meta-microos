SUMMARY = "Javadoc for xgboost"
DESCRIPTION = "Javadoc for xgboost"
LICENSE = "Apache-2.0"

PV = "0.90"

RPM_NAME = "xgboost-javadoc-0.90-3.4.noarch.rpm"
RPM_HASH = "ecdeb829173dc39a79a627a1528c48af23e792415da38b7834eb2a3fecaf2b7acea58308c45f8cf8dc4d9e1b31e2053e4d7d2ed78a5da302ae2ac3d07c9504c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xgboost-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
