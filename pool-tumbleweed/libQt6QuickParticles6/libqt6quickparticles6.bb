SUMMARY = "Qt 6 QuickParticles library"
DESCRIPTION = "The Qt 6 QuickParticles library. \
This library does not have any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6QuickParticles6-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "95baab087040a0a68bd3ca7f8ecda1a48f93b107f4bbf18174ab4cee1b63e2b36afda52a9adfa2398fb60ada81111dafd70fb0012a76ec885be5d9075188149e"

RPROVIDES:${PN} += "libQt6QuickParticles.so.6()(64bit) \
libQt6QuickParticles.so.6(Qt_6)(64bit) \
libQt6QuickParticles6 \
libQt6QuickParticles6(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Gui.so.6()(64bit) \
libQt6Gui.so.6(Qt_6)(64bit) \
libQt6Qml.so.6()(64bit) \
libQt6Qml.so.6(Qt_6)(64bit) \
libQt6Quick.so.6()(64bit) \
libQt6Quick.so.6(Qt_6)(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
