SUMMARY = "Qt5 webview examples"
DESCRIPTION = "Examples for libqt5-qtwebview module."
LICENSE = "BSD-3-Clause"

PV = "5.15.9+kde0"

RPM_NAME = "libqt5-qtwebview-examples-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "dbd8d05d26e6e545334f1ecb8ad18040dc1c3c0278114a8bb5491fd5048135174645e073d9faba5b63ba1401f118bbf3eb975637072b7cb45aa471a6117ccfac"

RPROVIDES:${PN} += "libqt5-qtwebview-examples \
libqt5-qtwebview-examples(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5WebView.so.5()(64bit) \
libQt5WebView.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
qt5qmlimport(QtQuick.2) \
qt5qmlimport(QtQuick.Controls.1) \
qt5qmlimport(QtQuick.Controls.Styles.1) \
qt5qmlimport(QtQuick.Layouts.1) \
qt5qmlimport(QtWebView.1)"

inherit rpm
