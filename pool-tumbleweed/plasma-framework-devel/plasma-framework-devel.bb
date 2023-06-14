SUMMARY = "Plasma library and runtime components"
DESCRIPTION = "Plasma library and runtime components based upon KF5 and Qt5"
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "5.106.0"

RPM_NAME = "plasma-framework-devel-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "1c9f83bb4d3a7ec25c4de93ab7c6d71d8b476cbccbfa5513d3f747e16c9378bb2419e43b1d90b8f9226011a6cc97f066f43900b032beba9b6997627bb3d99fe8"

RPROVIDES:${PN} += "cmake-KF5Plasma \
cmake-KF5PlasmaQuick \
plasma-framework-devel"

RDEPENDS:${PN} += "cmake-KF5Package \
cmake-KF5Service \
cmake-KF5WindowSystem \
cmake-Qt5Gui \
cmake-Qt5Qml \
cmake-Qt5Quick \
extra-cmake-modules \
kf5-filesystem \
libKF5Plasma5 \
plasma-framework \
plasma-framework-components \
plasma-framework-private"

inherit rpm
