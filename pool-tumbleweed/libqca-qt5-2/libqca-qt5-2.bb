SUMMARY = "QCA library"
DESCRIPTION = "The Qt cryptographic library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.3.6"

RPM_NAME = "libqca-qt5-2-2.3.6-1.2.aarch64.rpm"
RPM_HASH = "3f5d8fa117fe9796fe159fda38e5bcaa2e9cbf18a6993fa56837790c89de7e929494cb8d9651e3decfa3bdd399e9c95eabd9c0642a9a488eaac7aa9ae605c0bf"

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
