SUMMARY = "Qt 5 addon providing access to numerous types of archives: Build Environment"
DESCRIPTION = "KArchive provides classes for easy reading, creation and manipulation of \
'archive' formats like ZIP and TAR. \
 \
If also provides transparent compression and decompression of data, like the \
GZip format, via a subclass of QIODevice. Development files"
LICENSE = "LGPL-2.0-or-later"

PV = "5.107.0"

RPM_NAME = "karchive-devel-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "9888368d9fb9b9e28d5868eff22f9b8c96b8b8cbf99f77e120e7492e0306fcebc86f4b9a70107d25d726ea9e8acf136a05af862c9052aa54459bcfbd6c9c9156"

RPROVIDES:${PN} += "cmake-KF5Archive \
karchive-devel"

RDEPENDS:${PN} += "cmake-Qt5Core \
extra-cmake-modules \
libKF5Archive5"

inherit rpm
