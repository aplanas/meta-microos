SUMMARY = "Ogre 3D: an open source graphics engine"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine. \
 \
OGRE's property system allows you to associate values of arbitrary type with \
names, and have those values exposed via a self-describing interface."
LICENSE = "LGPL-2.1-only"

PV = "13.5.3"

RPM_NAME = "libOgreProperty13_5-13.5.3-2.3.aarch64.rpm"
RPM_HASH = "ed5e76140dc8d809bbc466876410c3d1af2faa8c3afd27ae3b2d7ab91e1a52ed613788c967d99cd0eb48b3d2ac4eaddf8bb6df44d1b397722d592a6ad0b27202"

RPROVIDES:${PN} += "libOgreProperty.so.13.5 \
libOgreProperty13-5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libOgreMain.so.13.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
