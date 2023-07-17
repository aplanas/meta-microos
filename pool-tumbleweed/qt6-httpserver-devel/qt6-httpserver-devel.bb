SUMMARY = "Qt 6 HttpServer library - Development files"
DESCRIPTION = "Development files for the Qt 6 HttpServer library."
LICENSE = "GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-httpserver-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "dbeae2986955fff76af054becb3f26ed0c2b140499a82f5035c10ca16c463324f6d8dbb5700cff1994e6b84eb4a8486e8ac18bb66e2458acd55d4aa8a0b7d2e6"

RPROVIDES:${PN} += "cmake-Qt6HttpServer \
pkgconfig-Qt6HttpServer \
qt6-httpserver-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Network \
cmake-Qt6WebSockets \
libQt6HttpServer6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Network \
pkgconfig-Qt6WebSockets"

inherit rpm
