SUMMARY = "The GNU Fortran Compiler Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the Fortran compiler \
of the GNU Compiler Collection (GCC)."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "13.2.1+git7683"

RPM_NAME = "libgfortran5-13.2.1+git7683-2.1.aarch64.rpm"
RPM_HASH = "80e12c3f6e57f4ce1ea07d33186526cd1a899dd19254ca4ff16bd816924d0e0eb4b19229bd714bb95578d29a36a6d566b31e5c069d2a4ee1261a1b1d782c60fa"

RPROVIDES:${PN} += "libgfortran.so.5 \
libgfortran5"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
