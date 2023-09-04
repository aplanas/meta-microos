SUMMARY = "Mesa Direct3D9 state tracker development package"
DESCRIPTION = "Mesa Direct3D9 state tracker development package"
LICENSE = "MIT"

PV = "23.1.5"

RPM_NAME = "Mesa-libd3d-devel-23.1.5-355.1.aarch64.rpm"
RPM_HASH = "f487502af710829f8ac3730a833f1be090cec6b1eb3897db29db32b5c4768d5bd329957896581244d093f734420a291296d52b5253ccad7fb3cf2180774179b3"

RPROVIDES:${PN} += "Mesa-libd3d-devel \
pkgconfig-d3d"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
Mesa-libd3d \
pkgconfig-libdrm"

inherit rpm
