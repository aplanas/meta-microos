SUMMARY = "Ogre 3D: an open source graphics engine"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine. \
Reusable utilities for rapid prototyping with Ogre."
LICENSE = "LGPL-2.1-only"

PV = "13.5.3"

RPM_NAME = "libOgreBites13_5-13.5.3-2.3.aarch64.rpm"
RPM_HASH = "ea946191990b4ff4e5b4ea929e36b730d4e7efb0c10f16f0d60763a08d828d9781a3bc82c826deefac922c06c820f0486e80e0541caf4863835ec1b4045c784f"

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
