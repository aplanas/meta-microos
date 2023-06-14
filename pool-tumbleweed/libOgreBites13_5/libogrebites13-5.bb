SUMMARY = "Ogre 3D: an open source graphics engine"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine. \
Reusable utilities for rapid prototyping with Ogre."
LICENSE = "LGPL-2.1-only"

PV = "13.5.3"

RPM_NAME = "libOgreBites13_5-13.5.3-1.5.aarch64.rpm"
RPM_HASH = "974f620f62092c2764a7be360ce6a860c852ac069ec12cf0c703ac8e8266cac3323e44d8ed367ad0e78ebbb2f1d836316e6b00be4a46d0df93a4e5b7395bceff"

RPROVIDES:${PN} += "libOgreBites.so.13.5 \
libOgreBites13-5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libOgreMain.so.13.5 \
libOgreOverlay.so.13.5 \
libOgreRTShaderSystem.so.13.5 \
libSDL2-2.0.so.0 \
libX11.so.6 \
libXaw.so.7 \
libXt.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
