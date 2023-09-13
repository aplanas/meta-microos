SUMMARY = "Ogre demo programs"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine. \
 \
This package contains the demo applications."
LICENSE = "LGPL-2.1-only"

PV = "13.5.3"

RPM_NAME = "ogre-demos-13.5.3-2.3.aarch64.rpm"
RPM_HASH = "73697d5c580b2a79c1c0ef5da50cf46f39b963e5936a4f842410421e3f36bff25dc222f53b26ea597b9aa9213109dca910bb22630e53686f82c8d31ce8f2e231"

RPROVIDES:${PN} += "ogre-demos"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libOgreBites.so.13.5 \
libOgreMain.so.13.5 \
libOgreMain13-5-plugins \
libOgreMeshLodGenerator.so.13.5 \
libOgreOverlay.so.13.5 \
libOgrePaging.so.13.5 \
libOgreRTShaderSystem.so.13.5 \
libOgreTerrain.so.13.5 \
libOgreVolume.so.13.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
ogre-media"

inherit rpm
