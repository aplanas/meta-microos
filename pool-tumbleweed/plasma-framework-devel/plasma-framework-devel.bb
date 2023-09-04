SUMMARY = "Plasma library and runtime components"
DESCRIPTION = "Plasma library and runtime components based upon KF5 and Qt5"
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "5.109.0"

RPM_NAME = "plasma-framework-devel-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "d55784a0181a112343b0312ea05defb837dba67b0371d34b3b2d07541fc1f6c137cd09eef5f02e615dd8f334b48a1b1b1619262967a5e6206d06b05792d11e74"

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
