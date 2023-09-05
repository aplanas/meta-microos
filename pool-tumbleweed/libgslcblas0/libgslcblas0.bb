SUMMARY = "A standard C language APIs for BLAS from GNU Scientific Library"
DESCRIPTION = "This library provides a native C interface to BLAS routines. This is part of \
the GNU Scientific Library."
LICENSE = "GPL-3.0-or-later"

PV = "2.7.1"

RPM_NAME = "libgslcblas0-2.7.1-2.1.aarch64.rpm"
RPM_HASH = "468ffeb753be8a5fd5f9b9c152223c39b83a98a32a8d2ef2161c46ebe2a6c4331ba5ca753417198fc7ee363caf90134ece996f17790c55683bff90e1f165a6d7"

RPROVIDES:${PN} += "libgslcblas.so.0 \
libgslcblas0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
