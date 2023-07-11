SUMMARY = "Non-ABI stable API for the Qt 6 DataVisualizationQml Library"
DESCRIPTION = "This package provides private headers of libQt6DataVisualizationQml that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-datavisualizationqml-private-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "8341a74692160f4b15dbd9214eba6b11b850641098b00719a748182b91e98002c6569cc139205fc0ef5a2464b57e5561b072fd429d7449998ba06b5bcb9fe3ff"

RPROVIDES:${PN} += "qt6-datavisualizationqml-private-devel"

RDEPENDS:${PN} += "cmake-Qt6DataVisualizationQml"

inherit rpm
