SUMMARY = "QCA library"
DESCRIPTION = "The Qt cryptographic library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.3.6"

RPM_NAME = "libqca-qt5-2-2.3.6-1.1.aarch64.rpm"
RPM_HASH = "f2321a99ecd440cd16ba2671e6f257c4540bc8075e9a07b0d7a7cb27f4a1b9895d8b78c2a092195707147fcb437eb328e8efef86cbd3af780faafc7678b69543"

RPROVIDES:${PN} += "libqca-qt5 \
libqca-qt5-2 \
libqca-qt5.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
qca-qt5"

inherit rpm
