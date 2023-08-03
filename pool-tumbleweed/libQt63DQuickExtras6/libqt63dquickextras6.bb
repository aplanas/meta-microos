SUMMARY = "Qt 6 3DQuickExtras library"
DESCRIPTION = "The Qt 6 3DQuickExtras library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "libQt63DQuickExtras6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "e0f2f7d0a8b92a011720ef0503a9e5a623826cc205845a47545e7c1816ceaab5dbf7778035d54743612b33b4671bd4484fa435597f6399e3fca75d3fd0ea7079"

RPROVIDES:${PN} += "libQt63DQuickExtras.so.6 \
libQt63DQuickExtras6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt63DCore.so.6 \
libQt63DExtras.so.6 \
libQt63DInput.so.6 \
libQt63DLogic.so.6 \
libQt63DQuick.so.6 \
libQt63DRender.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
