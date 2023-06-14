SUMMARY = "Arbitrary precision math library"
DESCRIPTION = "Part of the calc release consists of an arbitrary precision math link \
library.  This link library is used by the calc program to perform its \
own calculations.  If you wish, you can ignore the calc program entirely \
and call the arbitrary precision math routines from your own C programs."
LICENSE = "LGPL-2.1-only"

PV = "2.14.1.6"

RPM_NAME = "libcalc2_14_1_6-2.14.1.6-1.1.aarch64.rpm"
RPM_HASH = "14342a583b175b93f7ff748c02cdaf03380a8116c6d17a47c6286b0726b39a3a5779aa4a5dd673629e88cce6ab30fa93206b06a5dec3db66eff5463e08dcc2a0"

RPROVIDES:${PN} += "libcalc.so.2.14.1.6 \
libcalc2-14-1-6 \
libcustcalc.so.2.14.1.6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libreadline.so.8"

inherit rpm
