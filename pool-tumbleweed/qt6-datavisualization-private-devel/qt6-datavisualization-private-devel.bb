SUMMARY = "Non-ABI stable API for the Qt 6 DataVisualization Library"
DESCRIPTION = "This package provides private headers of libQt6DataVisualization that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-datavisualization-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "3ea43bfb4e314a1183206768dfcace5fc8cea7d1b9d8556d4b8a20d07b2a44715ec00ca069e0068ca93f456c8ec3f8c8d03885c414585a63e18eba44893c9553"

RPROVIDES:${PN} += "qt6-datavisualization-private-devel"

RDEPENDS:${PN} += "cmake-Qt6DataVisualization"

inherit rpm
