SUMMARY = "Widgets for showing progress of asynchronous jobs"
DESCRIPTION = "KJobWIdgets provides widgets for showing progress of asynchronous jobs. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "kjobwidgets-devel-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "4978ba89e218b1614b8480b2adcaa05c7a2d69d423cf031ce075477190405e1851b3c8467e396140946b8ac2d075eaba5a6f15507623dd9e098382ffb24bf02b"

RPROVIDES:${PN} += "cmake-KF5JobWidgets \
kjobwidgets-devel"

RDEPENDS:${PN} += "cmake-KF5CoreAddons \
cmake-Qt5Widgets \
extra-cmake-modules \
libKF5JobWidgets5"

inherit rpm
