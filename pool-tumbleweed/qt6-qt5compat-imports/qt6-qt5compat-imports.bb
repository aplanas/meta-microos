SUMMARY = "Qt 6 Core 5 Compat QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 Core5Compat module. \
This package shall be used while porting away from qtgraphicaleffects."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-qt5compat-imports-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "2887542c30d3557e6d6f17ee2a9a82b8e000711349015cda357d94651b5aba571f66aeee18f91a01e715b709842b14c00123bc45a2d101b95b45a20fa3970fd2"

RPROVIDES:${PN} += "libqtgraphicaleffectsplugin.so \
libqtgraphicaleffectsprivateplugin.so \
qt6-qt5compat-imports \
qt6qmlimport-Qt5Compat.GraphicalEffects.1 \
qt6qmlimport-Qt5Compat.GraphicalEffects.6 \
qt6qmlimport-Qt5Compat.GraphicalEffects.private.1 \
qt6qmlimport-Qt5Compat.GraphicalEffects.private.6"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6ShaderTools.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
