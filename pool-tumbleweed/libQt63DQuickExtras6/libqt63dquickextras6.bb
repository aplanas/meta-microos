SUMMARY = "Qt 6 3DQuickExtras library"
DESCRIPTION = "The Qt 6 3DQuickExtras library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt63DQuickExtras6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "d1a869253395eb61bb1217974d6176d01ec06100119d92d8af7d4f1e4987ae0f2d897e76231f04ec5a75beb106129271a66dc3189850608c477bf235370d8351"

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
