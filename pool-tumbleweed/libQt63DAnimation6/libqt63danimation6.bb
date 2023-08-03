SUMMARY = "Qt 6 3DAnimation library"
DESCRIPTION = "The Qt 6 3DAnimation library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "libQt63DAnimation6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "de353e7dcb1579a0a3221d632b021e4623a5a9d9a4c6ff1da797ffbc5cd1fdb0aa065f005f22ab97054603d94819635eb4ee15dd42d8f151be93cd4a6cb108a6"

RPROVIDES:${PN} += "libQt63DAnimation.so.6 \
libQt63DAnimation6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt63DCore.so.6 \
libQt63DRender.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
