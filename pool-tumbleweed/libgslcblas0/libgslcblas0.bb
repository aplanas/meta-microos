SUMMARY = "A standard C language APIs for BLAS from GNU Scientific Library"
DESCRIPTION = "This library provides a native C interface to BLAS routines. This is part of \
the GNU Scientific Library."
LICENSE = "GPL-3.0-or-later"

PV = "2.7.1"

RPM_NAME = "libgslcblas0-2.7.1-1.4.aarch64.rpm"
RPM_HASH = "5a5483c546c51a19cf30021795f29805c4caac23eac831eb0922daa89c7ba39af71211a258b067a0a9aa3c87f4b957b49ae1b7f4631c3adf811f443570f433aa"

RPROVIDES:${PN} += "libgslcblas.so.0 \
libgslcblas0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
