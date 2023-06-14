SUMMARY = "Development files for the Qt5's Webview library"
DESCRIPTION = "You need this package if you want to compile programs with QtWebView."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde0"

RPM_NAME = "libqt5-qtwebview-devel-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "b8cdd7287b6b4daa03f55ef0bb0f48f4b0904bbde395ff9dbc35ac9b1110864694c59cc6200b0fe92ddfb5adba89ba57acc7cf012547e5f2ff5e1f741a1228fe"

RPROVIDES:${PN} += "cmake-Qt5WebView \
libqt5-qtwebview-devel \
pkgconfig-Qt5WebView"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5WebView5 \
pkgconfig-Qt5Core \
pkgconfig-Qt5Gui"

inherit rpm
