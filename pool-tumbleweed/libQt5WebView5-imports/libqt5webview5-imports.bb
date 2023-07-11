SUMMARY = "Qt 5 WebView Library - QML imports"
DESCRIPTION = "Qt WebView provides a way to display web content in a QML application \
without necessarily including a full web browser stack by using \
native APIs where it makes sense."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde0"

RPM_NAME = "libQt5WebView5-imports-5.15.10+kde0-1.1.aarch64.rpm"
RPM_HASH = "a0ab153e29f2e41b51fb60695335e1fce7b9124af6166d2581b979e98923ea813f77e2fb46f428fd2537d181e951967cc35df4e87947a7135138a2c99587a3dd"

RPROVIDES:${PN} += "libQt5WebView5-imports \
libdeclarative-webview.so \
qt5qmlimport-QtWebView.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5WebView.so.5 \
libQtQuick5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
