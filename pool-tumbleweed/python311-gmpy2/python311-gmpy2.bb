SUMMARY = "GMP/MPIR, MPFR, and MPC interface to Python 2.6+ and 3x"
DESCRIPTION = "gmpy2 is a C-coded Python extension module that supports \
multiple-precision arithmetic. In addition to supporting \
GMP or MPIR for multiple-precision integer and rational \
arithmetic, gmpy2 adds support for the MPFR (correctly \
rounded real floating-point arithmetic) and MPC (correctly \
rounded complex floating-point arithmetic) libraries."
LICENSE = "LGPL-3.0-only"

PV = "2.1.5"

RPM_NAME = "python311-gmpy2-2.1.5-3.3.aarch64.rpm"
RPM_HASH = "16628869df257ec1068b1a20933f5a4ccdd15ab0978470fcf69859369975805d641a75133508baafb3b29f5227898f5d419f6ef2c893724f7c3f4d2bd0d56472"

RPROVIDES:${PN} += "python3-gmpy2 \
python3.11dist-gmpy2 \
python311-gmpy2 \
python3dist-gmpy2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
python-abi"

inherit rpm
