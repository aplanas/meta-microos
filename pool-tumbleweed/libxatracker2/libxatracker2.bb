SUMMARY = "XA state tracker"
DESCRIPTION = "This package contains the XA state tracker for gallium3D driver. \
It superseeds the Xorg state tracker and provides an infrastructure \
to accelerate Xorg 2D operations. It is currently used by vmwgfx \
video driver."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "libxatracker2-1.0.0-356.1.aarch64.rpm"
RPM_HASH = "bbfd45f69b9c29b41e70b54da0152e9a71034f7e548be9b82f879ee53c8123d60fcc45d5d19336c858acc3181d8a8c359474ff6c948f9d5b68fe578ebc1948e2"

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
