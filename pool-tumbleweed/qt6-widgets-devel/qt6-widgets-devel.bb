SUMMARY = "Development files for the Qt 6 Widgets library"
DESCRIPTION = "Development files for the Qt 6 Widgets library."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-widgets-devel-6.5.1-4.1.aarch64.rpm"
RPM_HASH = "6d2fa4b1e83dc78fadf9a269e31452aa2d6f16f04c0ad20726308cc60102c9ca122017a059fad367569b555a8bf6f2b9bea4ce51a429dcecbec090b5ed87672e"

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
