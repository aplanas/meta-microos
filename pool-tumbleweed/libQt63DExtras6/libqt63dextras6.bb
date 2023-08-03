SUMMARY = "Qt 6 3DExtras library"
DESCRIPTION = "The Qt 6 3DExtras library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "libQt63DExtras6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "3df4fef980a665d90a88ffaf291eb113f7863a4ef957637f8a85a0181fd59b1fe3ad39914a55a11e69c2e12e486f0b7cb3f3c3db3ae98a13e9b86fc57ec92ae9"

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
