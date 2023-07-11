SUMMARY = "Qt 5 WebView Library"
DESCRIPTION = "Qt WebView provides a way to display web content in a QML application \
without necessarily including a full web browser stack by using \
native APIs where it makes sense."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde0"

RPM_NAME = "libQt5WebView5-5.15.10+kde0-1.1.aarch64.rpm"
RPM_HASH = "92605c78bdd2eeeffacaf13df2192d9bf9b24705c56c18c5fd056b1aa71f7456a5d564f06e1ab4840d60a9a353b1f4cb533a7a8406823238fee721988bf0ab7d"

RPROVIDES:${PN} += "libQt5WebView.so.5 \
libQt5WebView5 \
libqtwebview-webengine.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5WebEngine.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
