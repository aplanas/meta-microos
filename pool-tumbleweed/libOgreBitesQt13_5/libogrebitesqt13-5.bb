SUMMARY = "Ogre 3D: an open source graphics engine"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine. \
Reusable utilities for rapid prototyping with Ogre."
LICENSE = "LGPL-2.1-only"

PV = "13.5.3"

RPM_NAME = "libOgreBitesQt13_5-13.5.3-2.3.aarch64.rpm"
RPM_HASH = "997ea824aceb437d329da20a961a1ff75c4a4612cc2ae9e27948847e539a69eefe081e795dae9012c1ffce89b2863e7f11e23cf050841ff0f63c7882813a3090"

RPROVIDES:${PN} += "libOgreBitesQt.so.13.5 \
libOgreBitesQt13-5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libOgreBites.so.13.5 \
libOgreMain.so.13.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
