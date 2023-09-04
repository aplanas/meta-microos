SUMMARY = "Development package for baloo5"
DESCRIPTION = "Baloo is a framework for searching and managing metadata. This \
package contains aditional command line utilities. Development files."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "5.109.0"

RPM_NAME = "baloo5-devel-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "cb62924d37ca1b59879fbb6b81f730b6e65c877533045e13cc428d3e506fdf30f8144399c838a9a61728d7aeecb92dd424227084e80df3442e4d421432791ab2"

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
