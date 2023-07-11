SUMMARY = "Plasma library and runtime components"
DESCRIPTION = "Plasma library and runtime components based upon KF5 and Qt5"
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "5.107.0"

RPM_NAME = "plasma-framework-devel-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "1362a97aa7473382165eedb353adeaa935b1fda1b37b713eea2dc77c9b4ec453def2484b9ba74818682d795a8a0141b016bbfe89651efeced1e020a4bff39e27"

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
