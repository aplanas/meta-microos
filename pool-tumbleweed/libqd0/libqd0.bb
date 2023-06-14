SUMMARY = "A library for nonlinear optimization"
DESCRIPTION = "qd provides numeric types of twice the precision of IEEE double \
(106 mantissa bits, or approximately 32 decimal digits) and four \
times the precision of IEEE double (212 mantissa bits, or approximately \
64 decimal digits).  Due to features such as operator and function \
overloading, these facilities can be utilized with only minor modifications \
to conventional C++ and Fortran-90 programs."
LICENSE = "BSD-3-Clause-LBNL"

PV = "2.3.23"

RPM_NAME = "libqd0-2.3.23-1.2.aarch64.rpm"
RPM_HASH = "8a71967f1b23a381edc1cb6b901bf7611c450af83674f61c4d57fc125b8ef3f8f0bfc37ba31fba5628f51d6010deeae34638498a51da133328e9af979227e7f9"

RPROVIDES:${PN} += "libqd-f-main.so.0 \
libqd.so.0 \
libqd0 \
libqdmod.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
