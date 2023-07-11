SUMMARY = "KDE Plasma Activities support"
DESCRIPTION = "Kactivities provides an API for using and interacting with the Plasma Activities Manager. \
Development files."
LICENSE = "LGPL-2.0-or-later"

PV = "5.107.0"

RPM_NAME = "kactivities-stats-devel-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "517d175962d8785e83f4e8db5c58944ccad67afc4315b5d938ca5e7dffab594fddca2ea6cdf899d759ef6697c2d4b3be4d3a4eb555b7ba4cb4d5ac0cc488692e"

RPROVIDES:${PN} += "cmake-KF5ActivitiesStats \
kactivities-stats-devel \
pkgconfig-libKActivitiesStats"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt5Core \
extra-cmake-modules \
libKF5ActivitiesStats1 \
pkgconfig-Qt5Core"

inherit rpm
