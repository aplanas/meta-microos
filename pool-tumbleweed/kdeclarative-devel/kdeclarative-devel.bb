SUMMARY = "Integration of QML and KDE workspaces: Build Environment"
DESCRIPTION = "KDeclarative provides integration of QML and KDE workspaces. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "kdeclarative-devel-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "c6aa45c5b0af6860d696212623a35fe679da60e2b19993ecd40fe25b66c342a7f4518714e1dacab8cf08ce606158f769ea4d1a646226e5b2bdc0e244d19d47e6"

RPROVIDES:${PN} += "cmake-KF5Declarative \
kdeclarative-devel"

RDEPENDS:${PN} += "cmake-KF5Config \
cmake-KF5CoreAddons \
cmake-KF5Package \
cmake-Qt5Qml \
extra-cmake-modules \
kdeclarative-components \
libKF5CalendarEvents5 \
libKF5Declarative5 \
libKF5QuickAddons5"

inherit rpm
