SUMMARY = "Qt 6 WebView library - Development files"
DESCRIPTION = "Development files for the Qt 6 WebView library"
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-webview-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "a337932b03b94efb958f25c2340f1668ef20c614dcef6d97290ba1614b11f18dd49e88954a6763887387b2c7f5a6ad20ab3505d89eb8bab8daf6ccf585d3b0c1"

RPROVIDES:${PN} += "cmake-Qt6WebView \
pkgconfig-Qt6WebView \
qt6-webview-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
libQt6WebView6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui"

inherit rpm
