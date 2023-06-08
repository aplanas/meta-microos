SUMMARY = "API documentation for felix-utils"
DESCRIPTION = "This package contains the API documentation for felix-utils."
LICENSE = "Apache-2.0"

PV = "1.11.4"

RPM_NAME = "felix-utils-javadoc-1.11.4-1.12.noarch.rpm"
RPM_HASH = "81431b13ce491397ba6156a60a9343a1651983c5af36a032a45e379e4e6675c8ed0fc54ce5b2a8930f46add109d608ebe4cd791863ec5ee6bc7bc0c5f2f514fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "felix-utils-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
