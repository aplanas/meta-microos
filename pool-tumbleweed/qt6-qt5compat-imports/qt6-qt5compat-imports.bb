SUMMARY = "Qt 6 Core 5 Compat QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 Core5Compat module. \
This package shall be used while porting away from qtgraphicaleffects."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-qt5compat-imports-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "d0be4c76ddf5ec189ddb97de517e5fd4d529e48a2a5dfa55f1508f224a5efd0cdd39b9fce8caf87df042115d5985027981cd3bcad4b0865ac323d773c6f861de"

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
