SUMMARY = "Qt 6 QuickParticles library"
DESCRIPTION = "The Qt 6 QuickParticles library. \
This library does not have any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "libQt6QuickParticles6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "294a4b0f685895c8aa1228d70ad9c4a93b5620a304b34a4468b58e931ffcca49f10845b3e487f7a6e8e471c630c7d1744338976a700bdd23f3f4b5a171ef700d"

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
