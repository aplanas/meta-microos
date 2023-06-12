SUMMARY = "Development Files for FreeImage"
DESCRIPTION = "This package provides development libraries and headers needed to build \
software using FreeImage."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "3.18.0"

RPM_NAME = "freeimage-devel-3.18.0-6.3.aarch64.rpm"
RPM_HASH = "ebb649716ce9b32c7c3da447d5fe95dd113fc1691c7c72ee14e27bb1d2262dbc34291ba9a7825b8ee128a1f9750b708b5a810616e5b06f07dc1594bf76126859"

RPROVIDES:${PN} += "freeimage-devel \
freeimage-devel(aarch-64) \
libfreeimage-devel"
RDEPENDS:${PN} += "libfreeimage3 \
libfreeimageplus3"

inherit rpm
