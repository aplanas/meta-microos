SUMMARY = "Qt 6 WebEngine QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 WebEngine module"
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-webengine-imports-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "48e667151621448b39809d47ab5a229ac1a625b0d88f6bde2fda3391cbbab463d6b51289129828cca8e65a09e1dfa6314c56cf7aa4dde60060eb00d93bd94dc1"

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
