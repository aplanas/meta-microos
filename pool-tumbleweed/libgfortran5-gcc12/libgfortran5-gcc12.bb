SUMMARY = "The GNU Fortran Compiler Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the Fortran compiler \
of the GNU Compiler Collection (GCC)."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "12.3.0+git1204"

RPM_NAME = "libgfortran5-gcc12-12.3.0+git1204-1.1.aarch64.rpm"
RPM_HASH = "79dbcf424afd34144dc35641e36bf422ccce9b0bcba37738ab5966e1a294c5c4798ebd26d5d58b3a784e4b7fc5875b5d6ebac4608244fb919d0e474502b29089"

RPROVIDES:${PN} += "libgfortran.so.5 \
libgfortran5 \
libgfortran5-gcc12"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
