SUMMARY = "Development files for libktorrent"
DESCRIPTION = "This package includes the necessary files for development using libktorrent."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "libktorrent-devel-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "f0edda0d8856e29dfb22636580dbd493e99ac9001a9747b753a770dd9de0a6f813dc913f83fa4b95224cf0829581bfeff5f39c6a39f012adc78d0c9cffcd1c24"

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
