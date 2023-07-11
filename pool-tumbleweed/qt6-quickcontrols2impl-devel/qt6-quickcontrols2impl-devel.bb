SUMMARY = "Qt6 QuickControls2Impl library - Development files"
DESCRIPTION = "Development files for the Qt 6 QuickControls2Impl library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-quickcontrols2impl-devel-6.5.1-1.3.aarch64.rpm"
RPM_HASH = "7ae3ac43654f69c52138b6c6781abbb2aade63b746681a0d48ffe0e414408fdc67779dcec37e322f3cae5653c3a9bc408c1260b8d2d832e6ceeab624a4d1611b"

RPROVIDES:${PN} += "cmake-Qt6QuickControls2Impl \
pkgconfig-Qt6QuickControls2Impl \
qt6-quickcontrols2impl-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
libQt6QuickControls2Impl6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Quick \
qt6-qml-private-devel \
qt6-quicktemplates2-private-devel"

inherit rpm
