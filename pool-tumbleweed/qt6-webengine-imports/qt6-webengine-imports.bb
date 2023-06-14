SUMMARY = "Qt 6 WebEngine QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 WebEngine module"
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-webengine-imports-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "9dba8640d3a910e1f5aa838ef9ccc9ba0f9246b9ab05562a6b9d42d0e8f7e0be583567c8bfc83a82477791fb2441231719e2657413cdda47439eb326e822f26d"

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
