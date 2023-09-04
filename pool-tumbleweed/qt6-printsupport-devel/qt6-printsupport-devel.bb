SUMMARY = "Development files for the Qt 6 PrintSupport library"
DESCRIPTION = "Development files for the Qt 6 PrintSupport library."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-printsupport-devel-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "f2beb4a7f2613dda0d24d5ab19725a22cc4d04246b74c7e0c6fb5219c01a594ae6211e387cd0c9a66248cc501169d736a42b74e04c3e9eb1e06f60f21342d4e6"

RPROVIDES:${PN} += "cmake-Qt6PrintSupport \
pkgconfig-Qt6PrintSupport \
qt6-printsupport-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Core \
cmake-Qt6Gui \
cmake-Qt6Widgets \
libQt6PrintSupport6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Widgets"

inherit rpm
