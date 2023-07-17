SUMMARY = "Qt 6 3DAnimation library"
DESCRIPTION = "The Qt 6 3DAnimation library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt63DAnimation6-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "3df55610879e0b462713dbb1ef7690313d6ff22d3aa4309563ba780c60ace2e66d8f8342943167a10762d4fa0274d04aaa9d6498f12a1b06de098a8bc990ade4"

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
