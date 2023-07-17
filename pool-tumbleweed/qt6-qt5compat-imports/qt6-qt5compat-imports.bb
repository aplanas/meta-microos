SUMMARY = "Qt 6 Core 5 Compat QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 Core5Compat module. \
This package shall be used while porting away from qtgraphicaleffects."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-qt5compat-imports-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "054deb07108dfe7ce15ebae71e33159523b16b1bf0e39ae55969b3a030594fc5439955d6235fe7e1ee3ba7f968f6b9dfaed504c848d597702e9a62fa43e245ed"

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
