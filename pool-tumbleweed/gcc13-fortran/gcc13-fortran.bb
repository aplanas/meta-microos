SUMMARY = "The GNU Fortran Compiler and Support Files"
DESCRIPTION = "This is the Fortran compiler of the GNU Compiler Collection (GCC)."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7364"

RPM_NAME = "gcc13-fortran-13.1.1+git7364-1.2.aarch64.rpm"
RPM_HASH = "4da3d3d52dc2e388cfde5a4fe8a833097b0c3c318be691a3c0b872d3feb1204bb15cfcbb2688709435e7af089021087d2d8372cd4617bbf245800e4987fc4fff"

RPROVIDES:${PN} += "gcc13-fortran"

RDEPENDS:${PN} += "gcc13 \
libc.so.6 \
libgfortran5 \
libgmp.so.10 \
libisl.so.23 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
