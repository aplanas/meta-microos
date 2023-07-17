SUMMARY = "Non-ABI stable API for the Qt 6 DataVisualization Library"
DESCRIPTION = "This package provides private headers of libQt6DataVisualization that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-datavisualization-private-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "d30dfa3da98b837dc12909b17938db36a6eeec53cae86f1cf5004eb79852af153f71f6fa8df33d1dc803e8b88b1227f84f8c290935c8a7b9e314aa6cd515d131"

RPROVIDES:${PN} += "qt6-datavisualization-private-devel"

RDEPENDS:${PN} += "cmake-Qt6DataVisualization"

inherit rpm
