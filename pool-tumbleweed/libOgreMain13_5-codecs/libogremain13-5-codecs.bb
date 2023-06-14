SUMMARY = "Ogre 3D: an open source graphics engine"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine."
LICENSE = "LGPL-2.1-only"

PV = "13.5.3"

RPM_NAME = "libOgreMain13_5-codecs-13.5.3-1.5.aarch64.rpm"
RPM_HASH = "48a0eed45f268f161d678e9fc2c21cf6d660b5aedf58c98299ed78c410c72b6d060f6d63a7d33253ee6885e6d76047c03b3afebcb8064535250adc97fdb9bc15"

RPROVIDES:${PN} += "libOgreMain-codecs \
libOgreMain13-5-codecs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libOgreMain.so.13.5 \
libOgreRTShaderSystem.so.13.5 \
libassimp.so.5 \
libc.so.6 \
libfreeimage.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
