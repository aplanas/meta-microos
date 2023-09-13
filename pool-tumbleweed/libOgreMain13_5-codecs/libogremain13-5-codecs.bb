SUMMARY = "Ogre 3D: an open source graphics engine"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine."
LICENSE = "LGPL-2.1-only"

PV = "13.5.3"

RPM_NAME = "libOgreMain13_5-codecs-13.5.3-2.3.aarch64.rpm"
RPM_HASH = "a10c78285406adaef6f0b295155f69b2f6379e1675c406579da374e34d967dade9bcd4937c461d3f56fed1e3c85a67436ba75a0342d9caca40a912a41aa86538"

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
