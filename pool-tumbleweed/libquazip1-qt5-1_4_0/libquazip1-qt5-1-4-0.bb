SUMMARY = "C++ wrapper for ZIP/UNZIP"
DESCRIPTION = "A C++ wrapper for the Gilles Vollant's ZIP/UNZIP C package, using Qt toolkit. \
Useful to access ZIP archives from Qt programs."
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "1.4"

RPM_NAME = "libquazip1-qt5-1_4_0-1.4-2.3.aarch64.rpm"
RPM_HASH = "c5877af734289ff43bb822528ec17d7d3b82675b8a91129aa387d9a864c42b63cda9a68a529b68677e01e91752d2069a4ab4c92f8f40902b0793462aaf102852"

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
