SUMMARY = "Examples for the qt6-datavis3d modules"
DESCRIPTION = "Examples for the qt6-datavis3d modules."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-datavis3d-examples-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "70f590fb4a5ec1efc3046af35bc74eebd36ffdb0ba6a021ee85fa460691bb6fccb4cd5b78111d7ad2893a97dfea96f70e8c0543ffdea8ba10e5981b5d1084ce6"

RPROVIDES:${PN} += "qt6-datavis3d-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DataVisualization.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
