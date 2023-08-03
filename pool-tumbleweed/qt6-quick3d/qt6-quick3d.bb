SUMMARY = "API for creating 3D content and 3D user interfaces based on Qt Quick"
DESCRIPTION = "Qt Quick 3D provides a high-level API for creating 3D content and 3D user \
interfaces based on Qt Quick."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-quick3d-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "a4ea2e4a7513613969fe3daf15ca2164858e2b4bdda0c84faca57a32108e923065d905eb970a2a52411f58d012f6b0a0fcbf0819224602190fdcb254285a0f33"

RPROVIDES:${PN} += "libassimp.so \
qt6-quick3d"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Concurrent.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6Quick3D.so.6 \
libQt6Quick3DAssetImport.so.6 \
libQt6Quick3DAssetUtils.so.6 \
libQt6Quick3DGlslParser.so.6 \
libQt6Quick3DIblBaker.so.6 \
libQt6Quick3DParticles.so.6 \
libQt6Quick3DRuntimeRender.so.6 \
libQt6Quick3DUtils.so.6 \
libQt6ShaderTools.so.6 \
libQt6Widgets.so.6 \
libassimp.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
