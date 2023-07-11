SUMMARY = "KDE Plasma Activities support"
DESCRIPTION = "Kactivities provides an API for using and interacting with the Plasma Activities Manager. \
Development files."
LICENSE = "GPL-2.0-or-later"

PV = "5.107.0"

RPM_NAME = "kactivities5-devel-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "18742b4ac28d0cfda5858dfd34befcfddeb6d55952582860ac7e7d0c0e3d0abd5de49b8eb31da9fc2c7dfb8c227d53f3cd7380dbdc85c9aba19c6830e36e66ae"

RPROVIDES:${PN} += "cmake-KF5Activities \
kactivities5-devel \
pkgconfig-libKActivities"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt5Core \
extra-cmake-modules \
libKF5Activities5 \
pkgconfig-Qt5Core"

inherit rpm
