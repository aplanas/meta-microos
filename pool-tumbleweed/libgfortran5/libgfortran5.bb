SUMMARY = "The GNU Fortran Compiler Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the Fortran compiler \
of the GNU Compiler Collection (GCC)."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "13.1.1+git7552"

RPM_NAME = "libgfortran5-13.1.1+git7552-1.1.aarch64.rpm"
RPM_HASH = "069df1f3fa745756bd976afb5275454736fd045e4746817b12de1e8bfabbbed85a9c40cd3da37e5a983530c5253c81cab6f8be74cc5ba3ab777b2a71634808f3"

RPROVIDES:${PN} += "libgfortran.so.5 \
libgfortran5"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
