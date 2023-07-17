SUMMARY = "Development package for baloo5"
DESCRIPTION = "Baloo is a framework for searching and managing metadata. This \
package contains aditional command line utilities. Development files."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "5.108.0"

RPM_NAME = "baloo5-devel-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "d02f5aab87467b590ef22cbe5aee780da3ec100a91009359171a8566b35f1f598a1c1bc334f815c177ce1c5c2bb3f737be219b023db73f94a1b8405bbfb2fd9f"

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
