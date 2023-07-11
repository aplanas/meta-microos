SUMMARY = "Development files for the Qt5's Webview library"
DESCRIPTION = "You need this package if you want to compile programs with QtWebView."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde0"

RPM_NAME = "libqt5-qtwebview-devel-5.15.10+kde0-1.1.aarch64.rpm"
RPM_HASH = "2676ca14455065f7ef157e1a0a8414876bdff5a493ede26aeb111a2e17871a5b024b1fa892c25634db9ca81af736d813ab943ab9479fcf05519a3e642be6132c"

RPROVIDES:${PN} += "cmake-Qt5WebView \
libqt5-qtwebview-devel \
pkgconfig-Qt5WebView"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5WebView5 \
pkgconfig-Qt5Core \
pkgconfig-Qt5Gui"

inherit rpm
