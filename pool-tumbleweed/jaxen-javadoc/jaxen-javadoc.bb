SUMMARY = "Javadoc for jaxen"
DESCRIPTION = "Javadoc for jaxen."
LICENSE = "BSD-3-Clause"

PV = "1.2.0"

RPM_NAME = "jaxen-javadoc-1.2.0-1.1.noarch.rpm"
RPM_HASH = "6339489dbc52adaf4ef0239794a56c695cda1aaaa21c1c833326acf02b01d0cf205fdafd8ec405b11d28cf5abc5787e4dc5f5d3e6f4d4bd30900d0d9a6739c5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jaxen-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
