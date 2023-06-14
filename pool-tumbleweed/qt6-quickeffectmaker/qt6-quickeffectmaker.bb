SUMMARY = "Tool for creating shader effects for Qt Quick"
DESCRIPTION = "Qt Quick Effect Maker is a hybrid editor for creating shader effects for Qt \
Quick applications and offers both a node editor and a code editor."
LICENSE = "GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-quickeffectmaker-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "e3a11f99b83cd21eb52833eb9a9b78b2059de13cb4d4c435dd05a0488180e5bfe0d119629ff7b12bccb32ba87b622807921eeba4a5b8475d744a43c2a2da8244"

RPROVIDES:${PN} += "qt6-quickeffectmaker"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6Quick3DGlslParser.so.6 \
libQt6ShaderTools.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
