SUMMARY = "KDE Plasma Activities support"
DESCRIPTION = "Kactivities provides an API for using and interacting with the Plasma Activities Manager. \
Development files."
LICENSE = "GPL-2.0-or-later"

PV = "5.109.0"

RPM_NAME = "kactivities5-devel-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "1478b2304ef235be8ad4273b5beb50373dc8f633cd1c22785a28405e8366ec21b58b50bf5bedb4f76a2e8b7d83c5607cac22b5935dd92829a34588406e8d6807"

RPROVIDES:${PN} += "cmake-KF5Activities \
kactivities5-devel \
pkgconfig-libKActivities"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt5Core \
extra-cmake-modules \
libKF5Activities5 \
pkgconfig-Qt5Core"

inherit rpm
