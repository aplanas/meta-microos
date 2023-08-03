SUMMARY = "Non-ABI stable API for the Qt 6 DataVisualizationQml Library"
DESCRIPTION = "This package provides private headers of libQt6DataVisualizationQml that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-datavisualizationqml-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "56f8fddf2b98df7920eac885f1dc0eb9d1ac18b0c30b89b543110f300b2024cffc42984b12afd1bf104062d4ecb161d7d24e479677fabdf4f2c3ca43768f41c1"

RPROVIDES:${PN} += "qt6-datavisualizationqml-private-devel"

RDEPENDS:${PN} += "cmake-Qt6DataVisualizationQml"

inherit rpm
