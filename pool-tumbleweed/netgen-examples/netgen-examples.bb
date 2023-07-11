SUMMARY = "NETGEN examples"
DESCRIPTION = "Various example geometry data for NETGEN."
LICENSE = "LGPL-2.1-only"

PV = "6.2.2301"

RPM_NAME = "netgen-examples-6.2.2301-1.5.noarch.rpm"
RPM_HASH = "0e86d824bc9e930812e3ce3a9f405549e36aca02bc2ed8ec0249c970db168a14210e67c00397571655630a3a615c2a267dc4a7c2bfbef78d52c7d15eb5173d17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "netgen-/usr/share/netgen/cube.geo \
netgen-examples"

RDEPENDS:${PN} += "netgen"

inherit rpm
