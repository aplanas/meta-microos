SUMMARY = "Ogre 3D: an open source graphics engine"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine."
LICENSE = "LGPL-2.1-only"

PV = "13.5.3"

RPM_NAME = "libOgreMain13_5-codecs-13.5.3-2.2.aarch64.rpm"
RPM_HASH = "366d1db1f66df4ac392d072aaa77f9908daba85e2e064eea8690f859b13b8251e9b3d02bd9015ccd9650dbd268f1c3380c13180a4e70e509164b586209283599"

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
