SUMMARY = "Javadoc for avalon-logkit"
DESCRIPTION = "API documentation for avalon-logkit."
LICENSE = "Apache-2.0"

PV = "2.1"

RPM_NAME = "avalon-logkit-javadoc-2.1-24.7.noarch.rpm"
RPM_HASH = "72fe07d8b6cbb8616e0ac7dadedf71db28115b6a12b434424135f1d827e1f59083202f2a207720f855e72e0164598ceddb2293b203dfe8f9e519b0fdd29c3c66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "avalon-logkit-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
