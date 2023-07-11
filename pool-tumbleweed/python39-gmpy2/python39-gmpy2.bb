SUMMARY = "GMP/MPIR, MPFR, and MPC interface to Python 2.6+ and 3x"
DESCRIPTION = "gmpy2 is a C-coded Python extension module that supports \
multiple-precision arithmetic. In addition to supporting \
GMP or MPIR for multiple-precision integer and rational \
arithmetic, gmpy2 adds support for the MPFR (correctly \
rounded real floating-point arithmetic) and MPC (correctly \
rounded complex floating-point arithmetic) libraries."
LICENSE = "LGPL-3.0-only"

PV = "2.1.5"

RPM_NAME = "python39-gmpy2-2.1.5-3.3.aarch64.rpm"
RPM_HASH = "3a577374904e64cd0beeb0b440a6cb40199f90883f965a633697befa1b45d1e8449f47a8c08d21feef8f16477d5ff660fcccc4d92010ec74610b1df1f31e7e85"

RPROVIDES:${PN} += "python3.9dist-gmpy2 \
python39-gmpy2 \
python3dist-gmpy2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
python-abi"

inherit rpm
