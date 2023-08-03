SUMMARY = "Qt 6 3DRender library"
DESCRIPTION = "The Qt 6 3DRender library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "libQt63DRender6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "012b0b1c2e82a1ed900e055ef093d97c133243c3e36f29dfd80fdc780b5720f5276b0b4c8749841e9ce757f0d01f61af600eabf9368ff857928e45edb49a0f53"

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
