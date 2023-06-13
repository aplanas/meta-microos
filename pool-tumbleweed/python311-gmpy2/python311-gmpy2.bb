SUMMARY = "GMP/MPIR, MPFR, and MPC interface to Python 2.6+ and 3x"
DESCRIPTION = "gmpy2 is a C-coded Python extension module that supports \
multiple-precision arithmetic. In addition to supporting \
GMP or MPIR for multiple-precision integer and rational \
arithmetic, gmpy2 adds support for the MPFR (correctly \
rounded real floating-point arithmetic) and MPC (correctly \
rounded complex floating-point arithmetic) libraries."
LICENSE = "LGPL-3.0-only"

PV = "2.1.5"

RPM_NAME = "python311-gmpy2-2.1.5-2.1.aarch64.rpm"
RPM_HASH = "8afae136f80d83ce03f2107525f0d852ab49d72805b8925352b18e9decf2bebd25df6443cd952f9282260e61b77e7f9968ce86b491ffba9c8752bed627847d14"

RPROVIDES:${PN} += "python3.11dist(gmpy2) \
python311-gmpy2 \
python311-gmpy2(aarch-64) \
python3dist(gmpy2)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit) \
libmpc.so.3()(64bit) \
libmpfr.so.6()(64bit) \
python(abi)"

inherit rpm
