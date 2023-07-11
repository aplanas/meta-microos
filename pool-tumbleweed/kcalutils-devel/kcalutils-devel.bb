SUMMARY = "Development files for kcalutils"
DESCRIPTION = "This package contains necessary include files and libraries needed \
to develop applications wanting to use kcalutils."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "kcalutils-devel-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "c1fc9503a9cf326735cf3505437720a69e8ada573797493212ba573e0fa0c22cf3114aa3a98fa998d382fc2fe53fe956d180f63f4ff74b7d5ae58e11e50295ba"

RPROVIDES:${PN} += "cmake-KF5CalendarUtils \
cmake-KPim5CalendarUtils \
kcalutils-devel \
kcalutils5-devel"

RDEPENDS:${PN} += "cmake-KF5CalendarCore \
cmake-KF5CoreAddons \
cmake-KF5KDELibs4Support \
libKPim5CalendarUtils5"

inherit rpm
