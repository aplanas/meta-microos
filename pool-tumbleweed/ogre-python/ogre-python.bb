SUMMARY = "Python bindings for OGRE"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine."
LICENSE = "LGPL-2.1-only"

PV = "13.5.3"

RPM_NAME = "ogre-python-13.5.3-2.3.aarch64.rpm"
RPM_HASH = "ce59d5d2aac2587cf46adff6b6dec1875baa651a121dbbb0a330cf99edd958a9a61c06c849f09f410b90fc8ccb7bb2873a6a5a37193ca2b267a79b1653404d9e"

RPROVIDES:${PN} += "ogre-python"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libOgreBites.so.13.5 \
libOgreMain.so.13.5 \
libOgreOverlay.so.13.5 \
libOgreRTShaderSystem.so.13.5 \
libOgreTerrain.so.13.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi"

inherit rpm
