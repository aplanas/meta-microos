SUMMARY = "KDE Plasma Activities support"
DESCRIPTION = "Kactivities provides an API for using and interacting with the Plasma Activities Manager. \
Development files."
LICENSE = "LGPL-2.0-or-later"

PV = "5.109.0"

RPM_NAME = "kactivities-stats-devel-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "468d01dcbdf512487013f6bb2a8ccd30ced63cf5dc120b8cbe02f4551e729770c81adbd080d27ea8c06cc920cb81a2632aec9d78744efd6ac5dfd7444eb7470d"

RPROVIDES:${PN} += "cmake-KF5ActivitiesStats \
kactivities-stats-devel \
pkgconfig-libKActivitiesStats"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt5Core \
extra-cmake-modules \
libKF5ActivitiesStats1 \
pkgconfig-Qt5Core"

inherit rpm
