SUMMARY = "Qt 5 WebView Library"
DESCRIPTION = "Qt WebView provides a way to display web content in a QML application \
without necessarily including a full web browser stack by using \
native APIs where it makes sense."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde0"

RPM_NAME = "libQt5WebView5-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "75b9fd3a8a82bc6b126a5ee67db6b3a87629966be821e7c071686a3661094c76694d55aa514b0ae69aa11ae7b1bd668a82ac728a4db8e44fbe1145a986253e9b"

RPROVIDES:${PN} += "libQt5WebView.so.5()(64bit) \
libQt5WebView.so.5(Qt_5)(64bit) \
libQt5WebView5 \
libQt5WebView5(aarch-64) \
libqtwebview_webengine.so()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network5 \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libQt5WebEngine.so.5()(64bit) \
libQt5WebEngine.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
