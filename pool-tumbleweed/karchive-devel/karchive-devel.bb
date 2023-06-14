SUMMARY = "Qt 5 addon providing access to numerous types of archives: Build Environment"
DESCRIPTION = "KArchive provides classes for easy reading, creation and manipulation of \
'archive' formats like ZIP and TAR. \
 \
If also provides transparent compression and decompression of data, like the \
GZip format, via a subclass of QIODevice. Development files"
LICENSE = "LGPL-2.0-or-later"

PV = "5.106.0"

RPM_NAME = "karchive-devel-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "fc7306786180f2453646d1da12a569d35dc5d8351c809c3fbb9e97521ba9ac5c772e1a2d0c24a9fb8baf02ffd87d64e668f6dfa74811af904c28a52d6ed32242"

RPROVIDES:${PN} += "cmake-KF5Archive \
karchive-devel"

RDEPENDS:${PN} += "cmake-Qt5Core \
extra-cmake-modules \
libKF5Archive5"

inherit rpm
