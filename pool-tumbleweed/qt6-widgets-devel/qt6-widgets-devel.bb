SUMMARY = "Development files for the Qt 6 Widgets library"
DESCRIPTION = "Development files for the Qt 6 Widgets library."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-widgets-devel-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "ce81cb1db93c84bd422204f1f1d97b44b61fabf09a4d86752cbeacef83cdf4269118a4651e321499c1f80394c4684e573169af139796080e378bb782c440d1fc"

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
