SUMMARY = "Non-ABI stable API for the Qt 6 DataVisualizationQml Library"
DESCRIPTION = "This package provides private headers of libQt6DataVisualizationQml that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-datavisualizationqml-private-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "8b684311026cb700392a2c9c8ea6860e002cda85fcbab5f85f5aef96e2d1a1c73311fba349d5a9ba081f5e7450ac6e569add1484f5bd84fb3e33fb69333febf3"

RPROVIDES:${PN} += "qt6-datavisualizationqml-private-devel"

RDEPENDS:${PN} += "cmake-Qt6DataVisualizationQml"

inherit rpm
