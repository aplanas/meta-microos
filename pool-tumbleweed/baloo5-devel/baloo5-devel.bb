SUMMARY = "Development package for baloo5"
DESCRIPTION = "Baloo is a framework for searching and managing metadata. This \
package contains aditional command line utilities. Development files."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "5.107.0"

RPM_NAME = "baloo5-devel-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "84378929c3e61805d0b74733cc30749c7e51d9c7320d393e0d842903b1e3780c74bf13c657126c7ce62baa1ddf1fee40cc4a7d22f1b90a0f60951b2d1abbbd5a"

RPROVIDES:${PN} += "baloo5-devel \
cmake-KF5Baloo \
pkgconfig-Baloo"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-KF5CoreAddons \
cmake-KF5FileMetaData \
cmake-Qt5Core \
libKF5Baloo5 \
libKF5BalooEngine5 \
lmdb-devel \
pkgconfig-Qt5Core"

inherit rpm
