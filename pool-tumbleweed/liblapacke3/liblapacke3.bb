SUMMARY = "LAPACKE development files"
DESCRIPTION = "This library provides a native C interface to LAPACK routines available \
at www.netlib.org/lapack to facilitate usage of LAPACK functionality \
for C programmers. \
 \
This implementation introduces: \
- row-major and column-major matrix layout controlled by the first function \
  parameter; \
- an implementation with working arrays (middle-level interface) as well as \
  without working arrays (high-level interface); \
- input scalars passed by value; \
- error code as a return value instead of the INFO parameter."
LICENSE = "BSD-3-Clause"

PV = "3.9.0"

RPM_NAME = "liblapacke3-3.9.0-9.1.aarch64.rpm"
RPM_HASH = "b97dc0318e3a7b9db0050a97df2a97f51ee6f891023a75981acea726b0cc064c3c56d52aa3eb4cbb2963086bea9beef066c0ba08bc2c5876cadff02867da97d4"

RPROVIDES:${PN} += "liblapacke.so.3 \
liblapacke3"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblapack.so.3 \
update-alternatives"

inherit rpm
