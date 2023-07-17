SUMMARY = "Widgets for showing progress of asynchronous jobs"
DESCRIPTION = "KJobWIdgets provides widgets for showing progress of asynchronous jobs. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "kjobwidgets-devel-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "eae0ed46ccde023d93e51029d747d8d3a8c1481d9dce678dc52d3c6f2d4ccc9eca6cfd6376d3e90326711f88a05643c04a71a278caa37e4ddc860e53ea2e6146"

RPROVIDES:${PN} += "cmake-KF5JobWidgets \
kjobwidgets-devel"

RDEPENDS:${PN} += "cmake-KF5CoreAddons \
cmake-Qt5Widgets \
extra-cmake-modules \
libKF5JobWidgets5"

inherit rpm
