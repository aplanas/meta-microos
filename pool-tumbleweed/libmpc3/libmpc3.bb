SUMMARY = "MPC multiple-precision complex shared library"
DESCRIPTION = "MPC is a C library for the arithmetic of complex numbers with \
arbitrarily high precision and correct rounding of the result. It is \
built upon and follows the same principles as MPFR."
LICENSE = "LGPL-3.0-or-later"

PV = "1.3.1"

RPM_NAME = "libmpc3-1.3.1-1.3.aarch64.rpm"
RPM_HASH = "0e16d1e58c57f47b93dabee8116cc724a9c2547abd21e168ca061bf47bbbd9aa1b6a610c38dd32d0459e63fa84e349a9cbc3509e890a039690e47298952eb10c"

RPROVIDES:${PN} += "libmpc.so.3 \
libmpc3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libmpfr.so.6"

inherit rpm
