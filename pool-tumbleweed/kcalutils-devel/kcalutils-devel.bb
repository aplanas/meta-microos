SUMMARY = "Development files for kcalutils"
DESCRIPTION = "This package contains necessary include files and libraries needed \
to develop applications wanting to use kcalutils."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "kcalutils-devel-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "adc61d5bc966ca40e11a5f2b3074bcdee01d75a81b243d8d52abb0e527b4628cdb32c20fb4dd8c858084954ced8e1683728a51bfe3fc9d9eefaf49a18b7e285d"

RPROVIDES:${PN} += "cmake-KPim5CalendarUtils \
kcalutils-devel \
kcalutils5-devel"

RDEPENDS:${PN} += "cmake-KF5CalendarCore \
cmake-KF5CoreAddons \
cmake-KF5KDELibs4Support \
libKPim5CalendarUtils5"

inherit rpm
