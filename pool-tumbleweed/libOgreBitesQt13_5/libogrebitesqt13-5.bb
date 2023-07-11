SUMMARY = "Ogre 3D: an open source graphics engine"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine. \
Reusable utilities for rapid prototyping with Ogre."
LICENSE = "LGPL-2.1-only"

PV = "13.5.3"

RPM_NAME = "libOgreBitesQt13_5-13.5.3-2.2.aarch64.rpm"
RPM_HASH = "ddc287f9f5c554871f9078fdb55e2a1dac1424b8b6659e3874d2abeec05ba55f7dcb527c4c3c615fe460cfc91dfb5992cf755c930d5e6cac678358da9898f441"

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
