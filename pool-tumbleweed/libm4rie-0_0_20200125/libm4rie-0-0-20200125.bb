SUMMARY = "Library for linear arithmetic over GF(2^e)"
DESCRIPTION = "M4RIE is a library for arithmetic with dense matrices over the \
Galois Field GF(2^e)."
LICENSE = "GPL-2.0-or-later"

PV = "20200125"

RPM_NAME = "libm4rie-0_0_20200125-20200125-1.3.aarch64.rpm"
RPM_HASH = "c4c54537ab3203fd41b0ca307ce39d61341ebcfbd0951d7dfbfa6fd3fb5754a2d9c24cf932cb1dbbfadf677d1ea12f5439c0903d0c741cfe0c66511796d57f07"

RPROVIDES:${PN} += "libm4rie-0-0-20200125 \
libm4rie-0.0.20200125.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm4ri-0.0.20200125.so"

inherit rpm
