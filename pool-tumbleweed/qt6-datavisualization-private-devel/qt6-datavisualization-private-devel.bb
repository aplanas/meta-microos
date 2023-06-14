SUMMARY = "Non-ABI stable API for the Qt 6 DataVisualization Library"
DESCRIPTION = "This package provides private headers of libQt6DataVisualization that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-datavisualization-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "c9a1404dfb85ec51cc0488144b28a2aaa1634769c4cc29fe12aa8eca0aa0cfedde6fa979ab995616f06a5aeb6d4a96979f78772d8a4d3de5bb6e40d396be8de5"

RPROVIDES:${PN} += "qt6-datavisualization-private-devel"

RDEPENDS:${PN} += "cmake-Qt6DataVisualization"

inherit rpm
