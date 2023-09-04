SUMMARY = "Development files for the Qt 6 WebEngineWidgets library"
DESCRIPTION = "Development files for the Qt 6 WebEngineWidgets library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-webenginewidgets-devel-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "be17a7b9d2ad6656ab6f4906fb3dba4d6b4ba5c0836bba7ff83f2a44441bfc4142679df1509993072cb47b113186ae114d41d4549d6862db9e3a6356bcfe105b"

RPROVIDES:${PN} += "cmake-Qt6WebEngineWidgets \
pkgconfig-Qt6WebEngineWidgets \
qt6-webenginewidgets-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6PrintSupport \
cmake-Qt6Quick \
cmake-Qt6QuickWidgets \
cmake-Qt6WebEngineCore \
cmake-Qt6Widgets \
libQt6WebEngineWidgets6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6PrintSupport \
pkgconfig-Qt6WebEngineCore \
pkgconfig-Qt6Widgets"

inherit rpm
