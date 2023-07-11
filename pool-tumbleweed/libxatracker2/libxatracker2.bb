SUMMARY = "XA state tracker"
DESCRIPTION = "This package contains the XA state tracker for gallium3D driver. \
It superseeds the Xorg state tracker and provides an infrastructure \
to accelerate Xorg 2D operations. It is currently used by vmwgfx \
video driver."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "libxatracker2-1.0.0-353.1.aarch64.rpm"
RPM_HASH = "a1362c5f5b161f3029902abd8c2aa6176fe0171b0f6b4c3bca216b894279cceaa842d2569c4a6fcc0fe12758e32e6948dbcc724c17e295f0927b26687581da77"

RPROVIDES:${PN} += "libxatracker.so.2 \
libxatracker2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLLVM.so.16 \
libc.so.6 \
libdrm-nouveau.so.2 \
libdrm.so.2 \
libexpat.so.1 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
