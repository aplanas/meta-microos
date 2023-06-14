SUMMARY = "Examples for the qt6-3d modules"
DESCRIPTION = "Examples for the qt6-3d modules."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-3d-examples-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "fcd68b74c4686d1cb8d073752678a43508158a70639cbb32c697151141b60a58ab27b24bee6a97f7dba9cd6037cb427d2d4bf9b7636822494a77111d103e282e"

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
