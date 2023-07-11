SUMMARY = "A library for nonlinear optimization"
DESCRIPTION = "qd provides numeric types of twice the precision of IEEE double \
(106 mantissa bits, or approximately 32 decimal digits) and four \
times the precision of IEEE double (212 mantissa bits, or approximately \
64 decimal digits).  Due to features such as operator and function \
overloading, these facilities can be utilized with only minor modifications \
to conventional C++ and Fortran-90 programs."
LICENSE = "BSD-3-Clause-LBNL"

PV = "2.3.23"

RPM_NAME = "libqd0-2.3.23-1.3.aarch64.rpm"
RPM_HASH = "91524a8108f481bbcbf30c50260295c7e0fc3688d49bc596fcebcba7781edece7c179706a7143d143ff6a85565df7399be6bc40d08a0dd03cdad8545f607b099"

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
