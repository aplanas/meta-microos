SUMMARY = "Ogre demo programs"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine. \
 \
This package contains the demo applications."
LICENSE = "LGPL-2.1-only"

PV = "13.5.3"

RPM_NAME = "ogre-demos-13.5.3-1.5.aarch64.rpm"
RPM_HASH = "58ca4edf74049adeb609dfcfd2ae47bd4189669535ec1350e3305d735eb8fd87f05366abee58ff831c71d4ceac6811f758ea1adf7557dca580bc416783a4d2b4"

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
