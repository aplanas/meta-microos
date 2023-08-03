SUMMARY = "Arbitrary precision math library"
DESCRIPTION = "Part of the calc release consists of an arbitrary precision math link \
library.  This link library is used by the calc program to perform its \
own calculations.  If you wish, you can ignore the calc program entirely \
and call the arbitrary precision math routines from your own C programs."
LICENSE = "LGPL-2.1-only"

PV = "2.14.2.2"

RPM_NAME = "libcalc2_14_2_2-2.14.2.2-1.1.aarch64.rpm"
RPM_HASH = "dfe6805da9fd41a349a3bcdda8c1291089dca96daf8517a8296c9d51371f34d00ac898c1603338aa54891ca299e1c9ecc4d79b51ce909cf46e168346ededf8e0"

RPROVIDES:${PN} += "libcalc.so.2.14.2.2 \
libcalc2-14-2-2 \
libcustcalc.so.2.14.2.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libreadline.so.8"

inherit rpm
