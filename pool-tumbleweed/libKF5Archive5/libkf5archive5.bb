SUMMARY = "Qt 5 addon providing access to numerous types of archives"
DESCRIPTION = "KArchive provides classes for easy reading, creation and manipulation of \
'archive' formats like ZIP and TAR. \
 \
If also provides transparent compression and decompression of data, like the \
GZip format, via a subclass of QIODevice."
LICENSE = "LGPL-2.0-or-later"

PV = "5.106.0"

RPM_NAME = "libKF5Archive5-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "2f96aaeddb4548d94ac49050f77a2c5dffd55ece38792615541db7e4054510b5d1fa703dd0b1be0983bcfd9d6bfca574cde8142219af93de0fc22bfc38235f8d"

RPROVIDES:${PN} += "libKF5Archive.so.5 \
libKF5Archive5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Core5 \
libbz2.so.1 \
libc.so.6 \
liblzma.so.5 \
libstdc++.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
