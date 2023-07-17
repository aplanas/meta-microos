SUMMARY = "KDE Plasma Activities support"
DESCRIPTION = "Kactivities provides an API for using and interacting with the Plasma Activities Manager. \
Development files."
LICENSE = "GPL-2.0-or-later"

PV = "5.108.0"

RPM_NAME = "kactivities5-devel-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "eb53e7dace94c93dcb96b877311b2098e90b1d0bdd93f7840f55effdb39d9d675122c7cb8468d4d82413415f2b2f544cc3d3978426177047a496b485a91e1289"

RPROVIDES:${PN} += "cmake-KF5Activities \
kactivities5-devel \
pkgconfig-libKActivities"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt5Core \
extra-cmake-modules \
libKF5Activities5 \
pkgconfig-Qt5Core"

inherit rpm
