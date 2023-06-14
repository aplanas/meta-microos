SUMMARY = "Qt 6 3DExtras library"
DESCRIPTION = "The Qt 6 3DExtras library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt63DExtras6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "0224c03270d053cd495b0ea33d2ba41f065360a8a2a2be1682a5403a5a3595cf72ef7b7f57ab228f0de8c893220f858cf4db85ddbf7b751eb4492f711e549280"

RPROVIDES:${PN} += "libQt63DExtras.so.6 \
libQt63DExtras6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt63DCore.so.6 \
libQt63DInput.so.6 \
libQt63DLogic.so.6 \
libQt63DRender.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
