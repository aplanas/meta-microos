SUMMARY = "Development files for libcalc"
DESCRIPTION = "Part of the calc release consists of an arbitrary precision math link \
library.  This link library is used by the calc program to perform its \
own calculations.  If you wish, you can ignore the calc program entirely \
and call the arbitrary precision math routines from your own C programs. \
 \
This package contains the files needed for building programs that use \
this library."
LICENSE = "LGPL-2.1-only"

PV = "2.14.1.6"

RPM_NAME = "calc-devel-2.14.1.6-1.1.aarch64.rpm"
RPM_HASH = "12732b62541cad2819f97814bdd5d0c6ec852de8e23007f238c917a5b1bd9bb6f9b24ea1328c256e7e0c1952ca691cf93bfa2bd698e9e43e95f8b8e089791c38"

RPROVIDES:${PN} += "calc-devel calc-devel(aarch-64)"
RDEPENDS:${PN} += "libcalc2_14_1_6"

inherit rpm
