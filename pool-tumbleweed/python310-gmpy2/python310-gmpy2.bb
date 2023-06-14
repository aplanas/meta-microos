SUMMARY = "GMP/MPIR, MPFR, and MPC interface to Python 2.6+ and 3x"
DESCRIPTION = "gmpy2 is a C-coded Python extension module that supports \
multiple-precision arithmetic. In addition to supporting \
GMP or MPIR for multiple-precision integer and rational \
arithmetic, gmpy2 adds support for the MPFR (correctly \
rounded real floating-point arithmetic) and MPC (correctly \
rounded complex floating-point arithmetic) libraries."
LICENSE = "LGPL-3.0-only"

PV = "2.1.5"

RPM_NAME = "python310-gmpy2-2.1.5-2.1.aarch64.rpm"
RPM_HASH = "3a768bbe6418dc50d3634c130c92c6cfc65be6818bf73b4931c271f949edf87430a7171ea64743b85646c882b6e5430fbcc3d1b33892d3398722f85aa5b2379a"

RPROVIDES:${PN} += "python3-gmpy2 \
python3.10dist-gmpy2 \
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
