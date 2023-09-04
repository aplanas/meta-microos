SUMMARY = "Arbitrary precision math library"
DESCRIPTION = "Part of the calc release consists of an arbitrary precision math link \
library.  This link library is used by the calc program to perform its \
own calculations.  If you wish, you can ignore the calc program entirely \
and call the arbitrary precision math routines from your own C programs."
LICENSE = "LGPL-2.1-only"

PV = "2.14.3.4"

RPM_NAME = "libcalc2_14_3_4-2.14.3.4-1.1.aarch64.rpm"
RPM_HASH = "a2e152a6d1e6ba6a2a2ce0cfed734388953cecbbeb29aaa42a66349197aef4904fca07644576f067109c3f244762417991eccae2742d05fe09b71e14037a7004"

RPROVIDES:${PN} += "libcalc.so.2.14.3.4 \
libcalc2-14-3-4 \
libcustcalc.so.2.14.3.4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libreadline.so.8"

inherit rpm
