SUMMARY = "Qt 6 3DAnimation library"
DESCRIPTION = "The Qt 6 3DAnimation library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt63DAnimation6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "b14890a290f9212d99a2f1f73f85ba4173da838f3392eb6e9456eccddbe50cb792c419a32b2f3281d3d12630c93ce006e8ec9bf5db555e312905b297ecb1d029"

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
