SUMMARY = "Qt 6 Core 5 Compat QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 Core5Compat module. \
This package shall be used while porting away from qtgraphicaleffects."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-qt5compat-imports-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "280bebb10eef24ad40be1b41228cdfb0d09311ea725ac8878010cd3c553bcc0e13fe943b5e3156b283a62bbbd420e1a446f4d59756f2b41481bbaccbd78b8d37"

RPROVIDES:${PN} += "libqtgraphicaleffectsplugin.so \
libqtgraphicaleffectsprivateplugin.so \
qt6-qt5compat-imports \
qt6qmlimport-Qt5Compat.GraphicalEffects.1 \
qt6qmlimport-Qt5Compat.GraphicalEffects.6 \
qt6qmlimport-Qt5Compat.GraphicalEffects.private.1 \
qt6qmlimport-Qt5Compat.GraphicalEffects.private.2 \
qt6qmlimport-Qt5Compat.GraphicalEffects.private.5 \
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
