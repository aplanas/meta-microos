SUMMARY = "KDE Plasma Activities support"
DESCRIPTION = "Kactivities provides an API for using and interacting with the Plasma Activities Manager. \
Development files."
LICENSE = "LGPL-2.0-or-later"

PV = "5.108.0"

RPM_NAME = "kactivities-stats-devel-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "25a827824f445bf52db38684a5ed711375fdd4ba696bd0f814ceddba01f5bd7f3172eb2a88b56261711359640f058c13ab6f430ce130ab000e05c2106ad24f27"

RPROVIDES:${PN} += "cmake-KF5ActivitiesStats \
kactivities-stats-devel \
pkgconfig-libKActivitiesStats"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt5Core \
extra-cmake-modules \
libKF5ActivitiesStats1 \
pkgconfig-Qt5Core"

inherit rpm
