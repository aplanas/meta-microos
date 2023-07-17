SUMMARY = "Qt 5 addon providing access to numerous types of archives"
DESCRIPTION = "KArchive provides classes for easy reading, creation and manipulation of \
'archive' formats like ZIP and TAR. \
 \
If also provides transparent compression and decompression of data, like the \
GZip format, via a subclass of QIODevice."
LICENSE = "LGPL-2.0-or-later"

PV = "5.108.0"

RPM_NAME = "libKF5Archive5-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "18d6906f4a3232e6c9a20682aa9bf20522316fa5d0ff3d01d580e8d93925582598759f101b3d580f557d845171e544135b1d682a0997b09fcfdb2c00334c6f2c"

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
