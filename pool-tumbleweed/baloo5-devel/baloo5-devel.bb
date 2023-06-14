SUMMARY = "Development package for baloo5"
DESCRIPTION = "Baloo is a framework for searching and managing metadata. This \
package contains aditional command line utilities. Development files."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "5.106.0"

RPM_NAME = "baloo5-devel-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "d0acfea1264e0b904dcacc8e8c6c967c41343a3c9002a17e2e57fd2f8c34e301b16292d3d7adaef419c703464080a9a9162d4bf7a2a0d444890c08454afc8d3a"

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
