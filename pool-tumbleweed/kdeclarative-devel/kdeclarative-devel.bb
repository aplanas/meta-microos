SUMMARY = "Integration of QML and KDE workspaces: Build Environment"
DESCRIPTION = "KDeclarative provides integration of QML and KDE workspaces. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "kdeclarative-devel-5.107.0-1.2.aarch64.rpm"
RPM_HASH = "b0291456b1622339fe772845e019e26db87e5f1a5725bacafef8503563681ecb61d3ead3a4643394823efdd74ab2e0931756ae4a9bdfb7f4ee86313ec157fa84"

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
