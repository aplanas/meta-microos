SUMMARY = "Qt 6 WebViewQuick library - Development files"
DESCRIPTION = "Development files for the Qt 6 WebViewQuick library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-webviewquick-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "bb114b1cec258ea7906f7415bbe0155511ca568568965f1756338ed8a1e33fb85d5d73ca395e864092b47ee219b3281c16230f813a12270eebb7be30888688df"

RPROVIDES:${PN} += "cmake-Qt6WebViewQuick \
pkgconfig-Qt6WebViewQuick \
qt6-webviewquick-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6OpenGL \
cmake-Qt6QmlModels \
cmake-Qt6Quick \
cmake-Qt6WebView \
libQt6WebViewQuick6 \
pkgconfig-Qt6OpenGL \
pkgconfig-Qt6QmlModels \
pkgconfig-Qt6Quick"

inherit rpm
