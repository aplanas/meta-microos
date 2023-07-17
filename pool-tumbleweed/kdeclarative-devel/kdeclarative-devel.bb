SUMMARY = "Integration of QML and KDE workspaces: Build Environment"
DESCRIPTION = "KDeclarative provides integration of QML and KDE workspaces. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "kdeclarative-devel-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "882c7e0bd768eec1a8f95d4f786670bb3d9603662e130ad520a4737b9c44c9abb7d99b947e43b0f0eb858cf6039ca0c54cc6d8500b9bc641c7dd325f956293ae"

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
