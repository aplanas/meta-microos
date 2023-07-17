SUMMARY = "Qt 6 3DQuickExtras library"
DESCRIPTION = "The Qt 6 3DQuickExtras library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt63DQuickExtras6-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "e322ffb2d167fdc5596b70acc7c3c1bd8b0417775663f95743e2ed0be4248c9d2ea7c3f965900c68008c8e986bf3c9f51fb9b676b059ada50bef6c404dab4850"

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
