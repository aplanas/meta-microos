SUMMARY = "Ogre 3D: an open source graphics engine"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine. \
 \
OGRE's property system allows you to associate values of arbitrary type with \
names, and have those values exposed via a self-describing interface."
LICENSE = "LGPL-2.1-only"

PV = "13.5.3"

RPM_NAME = "libOgreProperty13_5-13.5.3-2.2.aarch64.rpm"
RPM_HASH = "39f5ca0f9595011d52c90dd0961add85c9368aee400b630e2ac2ededdf7d772dbee5046510342bd3e072bb638be323bc3ff3a65986a38080851970a0c1e51227"

RPROVIDES:${PN} += "libOgreProperty.so.13.5 \
libOgreProperty13-5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libOgreMain.so.13.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
