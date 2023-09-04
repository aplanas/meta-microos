SUMMARY = "Qt 6 QuickParticles library"
DESCRIPTION = "The Qt 6 QuickParticles library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "libQt6QuickParticles6-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "92eb35c2e90614585c4b16fb828de3e266f5b2c443889cdd8ea2e0cd9484ea2694e3497dc1b66f9748aeac5585099d5ba354f265f78d9420a843d433faf0407d"

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
