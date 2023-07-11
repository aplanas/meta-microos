SUMMARY = "Ogre 3D: an open source graphics engine"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine. \
Reusable utilities for rapid prototyping with Ogre."
LICENSE = "LGPL-2.1-only"

PV = "13.5.3"

RPM_NAME = "libOgreBites13_5-13.5.3-2.2.aarch64.rpm"
RPM_HASH = "3c420051fd7861830485a1ed450d358459c0d56bb4b6afc11b44a32d93230d1e46f94103ae2b146970130cf1f210bb2546a93bd5334ca71405c25d0777aff67b"

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
libstdc++.so.6"

inherit rpm
