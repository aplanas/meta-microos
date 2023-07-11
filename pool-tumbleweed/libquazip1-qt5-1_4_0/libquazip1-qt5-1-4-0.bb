SUMMARY = "C++ wrapper for ZIP/UNZIP"
DESCRIPTION = "A C++ wrapper for the Gilles Vollant's ZIP/UNZIP C package, using Qt toolkit. \
Useful to access ZIP archives from Qt programs."
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "1.4"

RPM_NAME = "libquazip1-qt5-1_4_0-1.4-2.4.aarch64.rpm"
RPM_HASH = "127414e6620a8baea68465f36268b483fa648e6d3683fd9c9f4ff64c3f724479ee549714a566a500c348c755dcc479d4f63ff25b1e5264f0cc4eccf72d76c2d7"

RPROVIDES:${PN} += "libquazip1 \
libquazip1-qt5-1-4-0 \
libquazip1-qt5.so.1.4.0 \
libquazip5-1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libbz2.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
