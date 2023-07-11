SUMMARY = "Static Libraries for the FOX Toolkit 1.6"
DESCRIPTION = "This package contains static libraries for developing applications \
which are statically linked against the FOX libraries. \
 \
FOX is a C++-based library for graphical user interface development."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.57"

RPM_NAME = "fox16-devel-static-1.6.57-4.2.aarch64.rpm"
RPM_HASH = "c417cbd46e6cd5c17576e348d35b1689b03338a14d81c40cbbba4344d33496c6a6440bb3f3945725f8f29ea718460f8f30eb7ac154fd8e638c80fbc744a1a763"

RPROVIDES:${PN} += "fox16-devel-static \
fox16-static"

RDEPENDS:${PN} += "fox16-devel"

inherit rpm
