SUMMARY = "The GNU Fortran Compiler Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the Fortran compiler \
of the GNU Compiler Collection (GCC)."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "13.1.1+git7364"

RPM_NAME = "libgfortran5-13.1.1+git7364-1.1.aarch64.rpm"
RPM_HASH = "9103a68a9a4e6cd40707a4ebea1394aba3a81a6da88b8d3de3f0a0f6a8f5bf1d6ecab3557e7eb731056dc56363079b119f8b787b6b8290b7f37a609f44bba13d"

RPROVIDES:${PN} += "libgfortran.so.5 \
libgfortran5"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
