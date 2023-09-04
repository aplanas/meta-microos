SUMMARY = "XA state tracker"
DESCRIPTION = "This package contains the XA state tracker for gallium3D driver. \
It superseeds the Xorg state tracker and provides an infrastructure \
to accelerate Xorg 2D operations. It is currently used by vmwgfx \
video driver."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "libxatracker2-1.0.0-355.1.aarch64.rpm"
RPM_HASH = "b36e208bf73f8d9c6fc53f6052a5cfa57c2614e7a313b02162ac1317391275c3e444e656d4586a4096f32a971d6ba52af1ddefa02565ae44eb35bc2c42ddac29"

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
