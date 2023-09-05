SUMMARY = "Development files for libktorrent"
DESCRIPTION = "This package includes the necessary files for development using libktorrent."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "libktorrent-devel-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "3e27f596c28be2c9eae4ffb85e591462f7494d2510d728921105acee6ca45595c48dd6d6ca3963aa0aaabf3d051bf5444bdf2dbb02ccdd1708da9f8077ce2a8f"

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
