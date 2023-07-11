SUMMARY = "MPC multiple-precision complex shared library"
DESCRIPTION = "MPC is a C library for the arithmetic of complex numbers with \
arbitrarily high precision and correct rounding of the result. It is \
built upon and follows the same principles as MPFR."
LICENSE = "LGPL-3.0-or-later"

PV = "1.3.1"

RPM_NAME = "libmpc3-1.3.1-1.5.aarch64.rpm"
RPM_HASH = "efeb4cf86077bdcc99133c8099d46c2c7065c5c148d82dbfef2634b9ba9a60a62db47215e1f51fd7e06fe0a223c5e9bd94dbce8b65ef2864065a36258df464ec"

RPROVIDES:${PN} += "libmpc.so.3 \
libmpc3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libmpfr.so.6"

inherit rpm
