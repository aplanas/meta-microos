SUMMARY = "Qt 5 addon providing access to numerous types of archives"
DESCRIPTION = "KArchive provides classes for easy reading, creation and manipulation of \
'archive' formats like ZIP and TAR. \
 \
If also provides transparent compression and decompression of data, like the \
GZip format, via a subclass of QIODevice."
LICENSE = "LGPL-2.0-or-later"

PV = "5.107.0"

RPM_NAME = "libKF5Archive5-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "44e8df503537c048c91bb19eb9b6b8c500c3f54ebd5518541fdc3f97c554ced85647fd7acf726ec4c9ce95fc3f91d57f9b4324461409bafc41059c7433688da8"

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
