SUMMARY = "Static Libraries for the FOX Toolkit 1.6"
DESCRIPTION = "This package contains static libraries for developing applications \
which are statically linked against the FOX libraries. \
 \
FOX is a C++-based library for graphical user interface development."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.57"

RPM_NAME = "fox16-devel-static-1.6.57-2.1.aarch64.rpm"
RPM_HASH = "69d9e54d8a88c89f1d7b316025c5f9eb3bbdf92c8358f0b914dd5877c0297de7b661ae88a958686b0afd2f40f1029386f1bd31d391c04a7d19c2dca3874a52b7"

RPROVIDES:${PN} += "fox16-devel-static fox16-devel-static(aarch-64) fox16-static"
RDEPENDS:${PN} += "fox16-devel"

inherit rpm
