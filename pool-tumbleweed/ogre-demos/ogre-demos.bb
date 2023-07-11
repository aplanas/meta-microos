SUMMARY = "Ogre demo programs"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine. \
 \
This package contains the demo applications."
LICENSE = "LGPL-2.1-only"

PV = "13.5.3"

RPM_NAME = "ogre-demos-13.5.3-2.2.aarch64.rpm"
RPM_HASH = "9f6545ad68a31ec2a3a7cf7ad5c2e4399ac5451b5636d496f82a9afa4738ea672063d14c8896d01dbbc8f986e5c66507c0a39fae135f46042ba6d264357e56be"

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
