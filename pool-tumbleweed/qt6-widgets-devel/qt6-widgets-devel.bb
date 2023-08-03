SUMMARY = "Development files for the Qt 6 Widgets library"
DESCRIPTION = "Development files for the Qt 6 Widgets library."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-widgets-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "953829722dd9e6a78330d72d9a87c9f2f7096694ba5fab75d7de4e31d67a5c450f94060737adb4f194e1d94430d16573a8bdaf5b7e968466d03fbd325ab48b60"

RPROVIDES:${PN} += "cmake-Qt6Widgets \
cmake-Qt6WidgetsTools \
pkgconfig-Qt6Widgets \
qt6-widgets-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Core \
cmake-Qt6Gui \
libQt6Widgets6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui"

inherit rpm
