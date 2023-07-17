SUMMARY = "Examples for the qt6-3d modules"
DESCRIPTION = "Examples for the qt6-3d modules."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-3d-examples-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "29a96dc32b5d21b20622f521d79d6d1f5ac214707a1661a5944c41f14ff331cf9a13dbda335eaeb633535ce13f12c869b74ee7eb44933e31cac8e90513d7df34"

RPROVIDES:${PN} += "qt6-3d-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt63DCore.so.6 \
libQt63DExtras.so.6 \
libQt63DQuick.so.6 \
libQt63DQuickExtras.so.6 \
libQt63DRender.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
