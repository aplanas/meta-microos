SUMMARY = "C++ wrapper for ZIP/UNZIP"
DESCRIPTION = "A C++ wrapper for the Gilles Vollant's ZIP/UNZIP C package, using Qt toolkit. \
Useful to access ZIP archives from Qt programs."
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "1.4"

RPM_NAME = "libquazip1-qt6-1_4_0-1.4-2.4.aarch64.rpm"
RPM_HASH = "7033c09cfe34aa9141de7ac9664864fd0e2d3f39848385f8f2d97e17e951062607adee7fe5f74693606b14327644ae07108f86849d89ff2469b3b33e58d39276"

RPROVIDES:${PN} += "libquazip1-qt6-1-4-0 \
libquazip1-qt6.so.1.4.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Core5Compat.so.6 \
libbz2.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
