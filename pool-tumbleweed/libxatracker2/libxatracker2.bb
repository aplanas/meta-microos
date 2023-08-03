SUMMARY = "XA state tracker"
DESCRIPTION = "This package contains the XA state tracker for gallium3D driver. \
It superseeds the Xorg state tracker and provides an infrastructure \
to accelerate Xorg 2D operations. It is currently used by vmwgfx \
video driver."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "libxatracker2-1.0.0-354.1.aarch64.rpm"
RPM_HASH = "16738fc25a0bc4a314a98acbb9ecfd7a5b5d15b04ed4789c7c3228efe2173eec898044a8381d11070d888a46b1a81d3f0fc340aee7d9861de69e7b5d22033f9e"

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
