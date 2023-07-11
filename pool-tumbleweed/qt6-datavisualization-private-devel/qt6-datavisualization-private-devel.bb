SUMMARY = "Non-ABI stable API for the Qt 6 DataVisualization Library"
DESCRIPTION = "This package provides private headers of libQt6DataVisualization that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-datavisualization-private-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "c79b33fa4bdcc47383b1d77ba0bf9d3881314f966fdc2cca8be905988ae61590f233def11eb0f6dedc51effd74075edfb9cf74417a1578a16bfea41e9c983773"

RPROVIDES:${PN} += "qt6-datavisualization-private-devel"

RDEPENDS:${PN} += "cmake-Qt6DataVisualization"

inherit rpm
