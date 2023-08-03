SUMMARY = "The GNU Fortran Compiler and Support Files"
DESCRIPTION = "This is the Fortran compiler of the GNU Compiler Collection (GCC)."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7597"

RPM_NAME = "gcc13-fortran-13.1.1+git7597-1.1.aarch64.rpm"
RPM_HASH = "be1b78dc410e6692326fb4a304c83061adf826fe60941ea9b7a7fd0db4dad4f258a56d640415374c13cb644329f1680df9c630b00e46f12d0034b25f94da9817"

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
