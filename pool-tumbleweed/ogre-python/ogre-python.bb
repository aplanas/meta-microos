SUMMARY = "Python bindings for OGRE"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine."
LICENSE = "LGPL-2.1-only"

PV = "13.5.3"

RPM_NAME = "ogre-python-13.5.3-2.2.aarch64.rpm"
RPM_HASH = "ad25267ca3edcb84415141ca0ab787782d18d59f8943da6669f3411d46bfe7c6f77aa9818b9ecc0efa393ab0a5d8c3ce23469127cb858454b60a4f7d0150f66d"

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
