SUMMARY = "The GNU Fortran Compiler and Support Files"
DESCRIPTION = "This is the Fortran compiler of the GNU Compiler Collection (GCC)."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7552"

RPM_NAME = "gcc13-fortran-13.1.1+git7552-1.1.aarch64.rpm"
RPM_HASH = "60666728373feedc151a54636cde93e0e6339d2c821492f59b94c91b315e51a83d289d6dd82899db46e6088fa8391e6e3b17447956cc90db36e371bb627a4908"

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
