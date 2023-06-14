SUMMARY = "Python bindings for OGRE"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine."
LICENSE = "LGPL-2.1-only"

PV = "13.5.3"

RPM_NAME = "ogre-python-13.5.3-1.5.aarch64.rpm"
RPM_HASH = "282a7213ccd0bd51a59fc540a6dc4c6339f99173178c44d565da1596bb09baeea2890ca85bf9c8da5fbdfb65472218f09e9fb686198efb9de0505da177b574b6"

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
