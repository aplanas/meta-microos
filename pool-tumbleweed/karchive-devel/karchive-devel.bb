SUMMARY = "Qt 5 addon providing access to numerous types of archives: Build Environment"
DESCRIPTION = "KArchive provides classes for easy reading, creation and manipulation of \
'archive' formats like ZIP and TAR. \
 \
If also provides transparent compression and decompression of data, like the \
GZip format, via a subclass of QIODevice. Development files"
LICENSE = "LGPL-2.0-or-later"

PV = "5.109.0"

RPM_NAME = "karchive-devel-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "1fcfac102a002116550e0c371d3ad3a0d5e564959953229ac0c4abe1bde2896ebe6135febc251da83a344bc8a5349894eb63e3023a70e89023e08da050bbf90a"

RPROVIDES:${PN} += "cmake-KF5Archive \
karchive-devel"

RDEPENDS:${PN} += "cmake-Qt5Core \
extra-cmake-modules \
libKF5Archive5"

inherit rpm
