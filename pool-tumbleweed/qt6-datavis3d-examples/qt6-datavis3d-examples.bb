SUMMARY = "Examples for the qt6-datavis3d modules"
DESCRIPTION = "Examples for the qt6-datavis3d modules."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-datavis3d-examples-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "db303bd620aa145adb418cec4164c46e22cb8bfd266cde974a16ec7ea610d0e3b0eec21b39517e54597d17ddf7979bf806b0741388efaf0effb46280936656df"

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
