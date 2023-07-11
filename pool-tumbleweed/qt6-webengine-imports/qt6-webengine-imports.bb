SUMMARY = "Qt 6 WebEngine QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 WebEngine module"
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-webengine-imports-6.5.1-1.3.aarch64.rpm"
RPM_HASH = "64aa41fccb9088f52e82479fbfcaf38676057f585e4140ab56be264f4ee98efc7fa486d6326eeae91c5ae0c545970e96f635f5c2794f51ad2e59f4c9bc9f74bc"

RPROVIDES:${PN} += "libqtwebenginequickdelegatesplugin.so \
libqtwebenginequickplugin.so \
qt6-webengine-imports \
qt6qmlimport-QtWebEngine.1 \
qt6qmlimport-QtWebEngine.2 \
qt6qmlimport-QtWebEngine.6 \
qt6qmlimport-QtWebEngine.ControlsDelegates.1 \
qt6qmlimport-QtWebEngine.ControlsDelegates.6"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libQt6WebEngineQuick.so.6 \
libQt6WebEngineQuickDelegatesQml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
