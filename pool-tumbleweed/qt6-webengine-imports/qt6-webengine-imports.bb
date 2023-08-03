SUMMARY = "Qt 6 WebEngine QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 WebEngine module"
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-webengine-imports-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "2045f88846ab4382dc13befa9b31001cc0ceaeb14b80de5eeea8e8ba147e1264d800be246230400c0e34048b5b8eb2eace6899e0c4626c7ab996af31ed26040f"

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
