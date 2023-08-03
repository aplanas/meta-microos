SUMMARY = "Tool for creating shader effects for Qt Quick"
DESCRIPTION = "Qt Quick Effect Maker is a hybrid editor for creating shader effects for Qt \
Quick applications and offers both a node editor and a code editor."
LICENSE = "GPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-quickeffectmaker-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "a42681d9b11369c7312315954cbec507b13d3e7523e4ee95f79e20435570e8e5f270f2d194662bd0a12bd0ae4a36e3f072653677dba6ea8d98fd0b8ac954bab0"

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
