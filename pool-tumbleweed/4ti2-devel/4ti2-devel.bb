SUMMARY = "Development files for 4ti2"
DESCRIPTION = "This subpackage contains the include files and library links for \
developing against 4ti2's libraries."
LICENSE = "GPL-2.0-or-later"

PV = "1.6.10"

RPM_NAME = "4ti2-devel-1.6.10-1.2.aarch64.rpm"
RPM_HASH = "c58a512438ca042b88902911aba2974c246e0e928f1283609313cdc50859cf2a0a4e9775f678ac4c211d00f31158c1a060e998c998d091fda9cc1cebf666db62"

RPROVIDES:${PN} += "4ti2-devel"

RDEPENDS:${PN} += "lib4ti2-0 \
libzsolve0"

inherit rpm
