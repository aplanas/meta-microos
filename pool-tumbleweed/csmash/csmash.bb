SUMMARY = "3D Table Tennis Game"
DESCRIPTION = "CannonSmash is a 3D table tennis game. The goal of this project is to \
represent various table tennis strategies in a computer game."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.6"

RPM_NAME = "csmash-0.6.6-274.5.aarch64.rpm"
RPM_HASH = "38edc7161905d3e758d1fc9f1d24631f75f99f2358a3954885920e095949246a63c2cd0ae4e0ac63f4fc40cb6ddee8149292d6a2d29313b35768162e92799f38"

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
