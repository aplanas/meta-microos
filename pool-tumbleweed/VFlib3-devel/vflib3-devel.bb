SUMMARY = "Development libraries for VFlib3"
DESCRIPTION = "Development headers and libraries for VFlib3"
LICENSE = "LGPL-2.1-or-later"

PV = "3.7.2"

RPM_NAME = "VFlib3-devel-3.7.2-1.10.aarch64.rpm"
RPM_HASH = "6d7b1f3d7f65c9fb12cd5560c3b7499b94aee5a08b12a0f2ccb1002774fc2d488e428b0df87f77bdfbc8df7f57192dff896b7db5af03573258dfe825a6a2b4a4"

RPROVIDES:${PN} += "VFlib3-devel"

RDEPENDS:${PN} += "libVFlib3-10 \
pkgconfig-freetype2 \
pkgconfig-kpathsea"

inherit rpm
