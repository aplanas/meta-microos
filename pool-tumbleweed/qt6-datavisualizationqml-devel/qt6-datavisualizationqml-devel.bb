SUMMARY = "Qt 6 DataVisualizationQml library - Development files"
DESCRIPTION = "Development files for the Qt 6 DataVisualizationQml library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-datavisualizationqml-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "6ae31a5ce93fcf5010a801ddde61ea936467e2d997673ef247a757d2e1dcc098a98db44f82985554501748f069e0bc186244661776a079fce020eeacda8faf14"

RPROVIDES:${PN} += "cmake(Qt6DataVisualizationQml) \
pkgconfig(Qt6DataVisualizationQml) \
qt6-datavisualizationqml-devel \
qt6-datavisualizationqml-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake(Qt6Gui) \
cmake(Qt6OpenGL) \
cmake(Qt6Qml) \
cmake(Qt6Quick) \
libQt6DataVisualizationQml6 \
qt6-datavisualization-private-devel"

inherit rpm
