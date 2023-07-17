SUMMARY = "Plasma library and runtime components"
DESCRIPTION = "Plasma library and runtime components based upon KF5 and Qt5"
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "5.108.0"

RPM_NAME = "plasma-framework-devel-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "b306262cba539a4111a209fa62afbb7636994ecca5bf29f73f956194bcaff2e32e14d2d8b6d428f8f25feea652254ea7fd237cdd723b73bc166d27c17efa4278"

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
