SUMMARY = "Qt 6 QuickParticles library"
DESCRIPTION = "The Qt 6 QuickParticles library. \
This library does not have any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6QuickParticles6-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "c076d023d76117c153c1ee4f1ebe2e8450cbb3c05eee545f07dbd6bc36ca020c9da8403ff416ed1760dabc99676c9cfa21fd6282f7f97d89ac672283f2fa6295"

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
