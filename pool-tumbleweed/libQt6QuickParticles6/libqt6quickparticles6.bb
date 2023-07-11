SUMMARY = "Qt 6 QuickParticles library"
DESCRIPTION = "The Qt 6 QuickParticles library. \
This library does not have any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6QuickParticles6-6.5.1-1.3.aarch64.rpm"
RPM_HASH = "5de825d347d70daa4f432ddbec6be5368f6da41d67facf975ca73797214484d2f7490a27ffb20683e2f2a57c73ff378fff8ccc7a1445dc7956a7d3e9bf64bf9f"

RPROVIDES:${PN} += "libQt6QuickParticles.so.6 \
libQt6QuickParticles6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
