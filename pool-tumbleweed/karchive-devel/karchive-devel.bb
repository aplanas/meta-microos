SUMMARY = "Qt 5 addon providing access to numerous types of archives: Build Environment"
DESCRIPTION = "KArchive provides classes for easy reading, creation and manipulation of \
'archive' formats like ZIP and TAR. \
 \
If also provides transparent compression and decompression of data, like the \
GZip format, via a subclass of QIODevice. Development files"
LICENSE = "LGPL-2.0-or-later"

PV = "5.108.0"

RPM_NAME = "karchive-devel-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "d7e2e69b72f63c0321c4763198c9b8a60e4f6049cc6817d9f6958c8983ad9b592cf96b0cd700a1bb2495d2f31749d54fea9bbeb9fcd60fc630bd5921722cf4f4"

RPROVIDES:${PN} += "cmake-KF5Archive \
karchive-devel"

RDEPENDS:${PN} += "cmake-Qt5Core \
extra-cmake-modules \
libKF5Archive5"

inherit rpm
