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

RPM_NAME = "liblapacke3-3.9.0-9.2.aarch64.rpm"
RPM_HASH = "56fb94b0492c21d9947e9fcb62d1a9b6de7fe4aa811ba43756c9d930fbde9f7224ab6022a9ba25deebdea1ff5a2a14ca3896c0df4a59412ba5725624d94829b7"

RPROVIDES:${PN} += "liblapacke.so.3 \
liblapacke3"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblapack.so.3 \
update-alternatives"

inherit rpm
