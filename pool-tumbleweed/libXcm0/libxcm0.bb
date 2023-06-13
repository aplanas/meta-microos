SUMMARY = "X Color Management Library"
DESCRIPTION = "The libXcm library is a reference implementation of the X Color Management specification. \
It allows to attach color regions to X windows to communicate with color \
servers. A EDID parser and a color management event observer are included."
LICENSE = "MIT"

PV = "0.5.4"

RPM_NAME = "libXcm0-0.5.4-1.22.aarch64.rpm"
RPM_HASH = "8d12b981982e14e12078335a4a74ad3f78ed92f376c4373a476dd51d93c20d09952e291c6e79794e458cc2871a3e931164507b99215a715be8cc9d3d0c280c01"

RPROVIDES:${PN} += "libXcm.so.0()(64bit) \
libXcm0 \
libXcm0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libXcmEDID.so.0()(64bit) \
libm.so.6()(64bit)"

inherit rpm
