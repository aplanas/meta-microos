SUMMARY = "Qt 6 3DRender library"
DESCRIPTION = "The Qt 6 3DRender library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt63DRender6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "a76693018cbd2c8d77cd558b16a97245a9cc52173b1d0107fbbe980bb3c4bf5df8157fef77c9fd07d8882fb0508300177d47e7e870ea05021157d9e325229bb4"

RPROVIDES:${PN} += "libQt63DRender.so.6 \
libQt63DRender6 \
libassimpsceneimport.so \
libdefaultgeometryloader.so \
libgltfgeometryloader.so \
libgltfsceneexport.so \
libgltfsceneimport.so \
libopenglrenderer.so \
librhirenderer.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt63DAnimation.so.6 \
libQt63DCore.so.6 \
libQt63DExtras.so.6 \
libQt6Concurrent.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6OpenGL.so.6 \
libQt6ShaderTools.so.6 \
libassimp.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
