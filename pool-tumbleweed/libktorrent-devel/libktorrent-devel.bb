SUMMARY = "Development files for libktorrent"
DESCRIPTION = "This package includes the necessary files for development using libktorrent."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "libktorrent-devel-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "6fc6458bfedc25f5d1192013087b5ff0329a5b25e8e229b934b157bbe3b55b3ca85d4cbf75e31a7e6cf4a0fb2ea6432928241973ff2ddbf11a9e76cf7c97a5ef"

RPROVIDES:${PN} += "cmake-KF5Torrent \
libktorrent-devel"

RDEPENDS:${PN} += "cmake-KF5Archive \
cmake-KF5Config \
cmake-KF5KIO \
cmake-Qca-qt5 \
cmake-Qt5Core \
cmake-Qt5Network \
gmp-devel \
libKF5Torrent6 \
libboost-headers-devel \
libgcrypt-devel"

inherit rpm
