SUMMARY = "Virtual Xserver Xvfb"
DESCRIPTION = "This package contains the virtual Xserver Xvfb."
LICENSE = "MIT"

PV = "21.1.8"

RPM_NAME = "xorg-x11-server-Xvfb-21.1.8-1.3.aarch64.rpm"
RPM_HASH = "77b6e4f31cf88d96bb299e3119fc064df5e41b9bff5fbabb5caf6fb05420dda05ac8f02b219b584a1ed440bdd7d1fb3efac3fffde92c8a88450a2508bd7912ac"

RPROVIDES:${PN} += "xorg-x11-Xvfb \
xorg-x11-server-/usr/bin/Xvfb \
xorg-x11-server-Xvfb"

RDEPENDS:${PN} += "Mesa \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libXau.so.6 \
libXdmcp.so.6 \
libXfont2.so.2 \
libc.so.6 \
libcrypto.so.3 \
libm.so.6 \
libpixman-1.so.0 \
libsystemd.so.0 \
xkbcomp \
xkeyboard-config"

inherit rpm
