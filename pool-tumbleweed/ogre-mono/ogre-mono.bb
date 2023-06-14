SUMMARY = "Mono bindings OGRE"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine."
LICENSE = "LGPL-2.1-only"

PV = "13.5.3"

RPM_NAME = "ogre-mono-13.5.3-1.5.aarch64.rpm"
RPM_HASH = "8387b0060ccaa302f40f9ca6cdd1fe8fca479e51bb6831e2f63c20baa183e515ff9cd98cde935c15ff805663c8df36d5b7dd73fd888ed63a4bf13375876dcb83"

RPROVIDES:${PN} += "libOgre.so \
ogre-mono"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libOgreBites.so.13.5 \
libOgreMain.so.13.5 \
libOgreOverlay.so.13.5 \
libOgreRTShaderSystem.so.13.5 \
libOgreTerrain.so.13.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
