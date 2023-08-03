SUMMARY = "Development files for the Qt 6 WebEngineWidgets library"
DESCRIPTION = "Development files for the Qt 6 WebEngineWidgets library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-webenginewidgets-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "262d044f727a90d5076753fd7de5ea0a67e3093d7ea6264d9d814db8ebe7e1b4997cd66159b09d74510546197a60d329d8d6551529624185df272c3ba6493e3a"

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
