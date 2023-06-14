SUMMARY = "Ogre 3D: an open source graphics engine"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine. \
 \
OGRE's property system allows you to associate values of arbitrary type with \
names, and have those values exposed via a self-describing interface."
LICENSE = "LGPL-2.1-only"

PV = "13.5.3"

RPM_NAME = "libOgreProperty13_5-13.5.3-1.5.aarch64.rpm"
RPM_HASH = "b240c0bbcf332c498d8aff89e73f3ce41803e2bc7f273abd640195024b447846ee3746e22a37628e1c0379a567d53a528aed3cec8e4a7e6e636e276e60d72f12"

RPROVIDES:${PN} += "libOgreProperty.so.13.5 \
libOgreProperty13-5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libOgreMain.so.13.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
