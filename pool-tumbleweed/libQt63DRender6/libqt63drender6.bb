SUMMARY = "Qt 6 3DRender library"
DESCRIPTION = "The Qt 6 3DRender library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt63DRender6-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "afbaff5128f2b6b58f5e29ebd7bafed13b0edd1221a53bbecfc8faf6357697df9f8830b2d778f416aeab419af2faf8af96d51fe1f34fab953339758ca75d14ed"

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
