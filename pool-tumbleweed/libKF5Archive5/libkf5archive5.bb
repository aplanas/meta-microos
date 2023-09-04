SUMMARY = "Qt 5 addon providing access to numerous types of archives"
DESCRIPTION = "KArchive provides classes for easy reading, creation and manipulation of \
'archive' formats like ZIP and TAR. \
 \
If also provides transparent compression and decompression of data, like the \
GZip format, via a subclass of QIODevice."
LICENSE = "LGPL-2.0-or-later"

PV = "5.109.0"

RPM_NAME = "libKF5Archive5-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "37aaebeb7427606ff62781000a73076155deefc154d13392c21bb868ca52d0ab67b9bb3e18461e03aeaa80f549fb5612e738c7b3eea4983f3e147d4a84b4787d"

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
