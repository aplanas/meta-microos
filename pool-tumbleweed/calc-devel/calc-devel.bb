SUMMARY = "Development files for libcalc"
DESCRIPTION = "Part of the calc release consists of an arbitrary precision math link \
library.  This link library is used by the calc program to perform its \
own calculations.  If you wish, you can ignore the calc program entirely \
and call the arbitrary precision math routines from your own C programs. \
 \
This package contains the files needed for building programs that use \
this library."
LICENSE = "LGPL-2.1-only"

PV = "2.14.2.2"

RPM_NAME = "calc-devel-2.14.2.2-1.1.aarch64.rpm"
RPM_HASH = "d5dff6fe9e387e956f93c0e2b90f2627b642f4edaa8840235af51c5b38444db10f1add5fbab84f4e02c4ac9a9f18ca7c681f4a10da93af7bed8b8c3e425550e6"

RPROVIDES:${PN} += "calc-devel"

RDEPENDS:${PN} += "libcalc2-14-2-2"

inherit rpm
