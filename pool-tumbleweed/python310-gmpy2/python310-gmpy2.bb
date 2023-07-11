SUMMARY = "GMP/MPIR, MPFR, and MPC interface to Python 2.6+ and 3x"
DESCRIPTION = "gmpy2 is a C-coded Python extension module that supports \
multiple-precision arithmetic. In addition to supporting \
GMP or MPIR for multiple-precision integer and rational \
arithmetic, gmpy2 adds support for the MPFR (correctly \
rounded real floating-point arithmetic) and MPC (correctly \
rounded complex floating-point arithmetic) libraries."
LICENSE = "LGPL-3.0-only"

PV = "2.1.5"

RPM_NAME = "python310-gmpy2-2.1.5-3.3.aarch64.rpm"
RPM_HASH = "4488e9db513e63fdb3ae1be9229ae8ba04b775d9fa8050a4bb860c4194c4ba5939d198ec02b40ab96af4678060a27df0d3ce1ea512538fe195bf188d614a74bd"

RPROVIDES:${PN} += "python3.10dist-gmpy2 \
python310-gmpy2 \
python3dist-gmpy2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
python-abi"

inherit rpm
