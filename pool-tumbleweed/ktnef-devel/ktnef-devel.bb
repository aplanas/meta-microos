SUMMARY = "Development files for libKPim5Tnef5"
DESCRIPTION = "This package contains necessary include files and libraries needed \
to develop KDE PIM applications."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "ktnef-devel-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "e74573a049587013bf5eb627e7cb09842824ea5ab4d0acd55e04b9a5a5543cd8b313a72e6c987c64adf674a2425711687dda3e78fb4c037ab8840f0fed814f73"

RPROVIDES:${PN} += "cmake-KPim5Tnef \
ktnef-devel"

RDEPENDS:${PN} += "cmake-KF5CalendarCore \
libKPim5Tnef5"

inherit rpm
