SUMMARY = "Development files for the Qt 6 WebEngineWidgets library"
DESCRIPTION = "Development files for the Qt 6 WebEngineWidgets library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-webenginewidgets-devel-6.5.1-1.3.aarch64.rpm"
RPM_HASH = "b663783c89b4bd465e8938d825a3a47443886c01b4b7268ddbe6d23cbac0893e3f0430c70eda5e1ed26005de67238244ccd48947a4bd6e4d00aac120647d3ae9"

RPROVIDES:${PN} += "cmake-Qt6WebEngineWidgets \
pkgconfig-Qt6WebEngineWidgets \
qt6-webenginewidgets-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6PrintSupport \
cmake-Qt6QuickWidgets \
cmake-Qt6WebEngineCore \
libQt6WebEngineWidgets6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6PrintSupport \
pkgconfig-Qt6WebEngineCore \
pkgconfig-Qt6Widgets \
qt6-quick-private-devel"

inherit rpm
