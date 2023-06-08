SUMMARY = "Development files for libcalc"
DESCRIPTION = "Part of the calc release consists of an arbitrary precision math link \
library.  This link library is used by the calc program to perform its \
own calculations.  If you wish, you can ignore the calc program entirely \
and call the arbitrary precision math routines from your own C programs. \
 \
This package contains the files needed for building programs that use \
this library."
LICENSE = "LGPL-2.1-only"

PV = "2.14.1.5"

RPM_NAME = "calc-devel-2.14.1.5-1.3.aarch64.rpm"
RPM_HASH = "949b7633eccdf9f725623b2160d3195718fd9596dcf30c8ec02e9bfc626fef4eed43e1fa24bbb881065173e36356f7b00325c2ffcb8150a778d173581c9155fe"

RPROVIDES:${PN} += "calc-devel calc-devel(aarch-64)"
RDEPENDS:${PN} += "libcalc2_14_1_5"

inherit rpm
