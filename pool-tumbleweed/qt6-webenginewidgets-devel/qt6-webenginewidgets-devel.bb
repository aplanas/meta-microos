SUMMARY = "Development files for the Qt 6 WebEngineWidgets library"
DESCRIPTION = "Development files for the Qt 6 WebEngineWidgets library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-webenginewidgets-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "0339de84bb0108f77e777d7d7f0be597c533dc1032e86663dad2ce103ccf55b675883c1370c21d4caa09eae7554de4de20012d45836ccec41058b3dc0184096d"

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
