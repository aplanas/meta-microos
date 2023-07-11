SUMMARY = "Qt 6 Quick3DIblBaker library"
DESCRIPTION = "The Qt 6 Quick3DIblBaker library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6Quick3DIblBaker6-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "dc6a799d869d2d256b2d7d149e77a00a1c30e2eae17f6d1fb45a0bf692e8f6d425d734a67e93d39537bb4aa9386238baaa1849676493a74862c403014ea8694b"

RPROVIDES:${PN} += "libQt6Quick3DIblBaker.so.6 \
libQt6Quick3DIblBaker6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Quick3DRuntimeRender.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
