SUMMARY = "3D Table Tennis Game"
DESCRIPTION = "CannonSmash is a 3D table tennis game. The goal of this project is to \
represent various table tennis strategies in a computer game."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.6"

RPM_NAME = "csmash-0.6.6-274.6.aarch64.rpm"
RPM_HASH = "6e7ea9a0bc15f826affced9d1b4349c7afa649a2ccbcc8f7845ef177c4927e5c25dad518e0b6fb585d272c1b8c1a2dfdfc6a4cf0aeea94603f5bd86b4aeb25cc"

RPROVIDES:${PN} += "csmash"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLU.so.1 \
libSDL-1.2.so.0 \
libSDL-image-1.2.so.0 \
libSDL-mixer-1.2.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
