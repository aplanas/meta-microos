SUMMARY = "Qt 5 3D Addon"
DESCRIPTION = "Qt is a set of libraries for developing applications. \
 \
The Qt 3D Render module contains functionality to support 2D and 3D \
rendering using Qt 3D."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde0"

RPM_NAME = "libQt53DRender5-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "9257da4a551e7b3a45f18ac707d53bbb9ad57fe17915c739e18a0262cac479406cdc0e2148a37e197fc585692e8b8fe8a1dfd9c28e79d976db0aa40fa13cc962"

RPROVIDES:${PN} += "libQt53DRender.so.5 \
libQt53DRender5 \
libQt53DRenderer5 \
libassimpsceneimport.so \
libdefaultgeometryloader.so \
libgltfgeometryloader.so \
libgltfsceneexport.so \
libgltfsceneimport.so \
libopenglrenderer.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt53DAnimation.so.5 \
libQt53DCore.so.5 \
libQt53DExtras.so.5 \
libQt5Concurrent.so.5 \
libQt5Core.so.5 \
libQt5Core5 \
libQt5Gui.so.5 \
libassimp.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
