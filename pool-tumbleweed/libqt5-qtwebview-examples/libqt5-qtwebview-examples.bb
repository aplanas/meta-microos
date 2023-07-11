SUMMARY = "Qt5 webview examples"
DESCRIPTION = "Examples for libqt5-qtwebview module."
LICENSE = "BSD-3-Clause"

PV = "5.15.10+kde0"

RPM_NAME = "libqt5-qtwebview-examples-5.15.10+kde0-1.1.aarch64.rpm"
RPM_HASH = "be419e11da85bdeea2919e76a3bf473b9802945aa700ca86a5186e67c0ed8a532b1851bb81c186be9bffb60d121409fb58e6c13c0a2f888b6ba86b4bcd27be16"

RPROVIDES:${PN} += "libqt5-qtwebview-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5WebView.so.5 \
libc.so.6 \
libstdc++.so.6 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.1 \
qt5qmlimport-QtQuick.Controls.Styles.1 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-QtWebView.1"

inherit rpm
