SUMMARY = "Development files for libKPim5Tnef5"
DESCRIPTION = "This package contains necessary include files and libraries needed \
to develop KDE PIM applications."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "ktnef-devel-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "09cc539188e5db947a6a84945c8ae750cdefe6106965708992b4d79a3279aefdd9d91585e8c1a0a4366a31ba2fcb43f0d14388c12b75405609d54f0bfb6c1cf6"

RPROVIDES:${PN} += "cmake-KF5Tnef \
cmake-KPim5Tnef \
ktnef-devel"

RDEPENDS:${PN} += "cmake-KF5CalendarCore \
libKPim5Tnef5"

inherit rpm
