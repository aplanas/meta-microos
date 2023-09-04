SUMMARY = "The GNU Fortran Compiler and Support Files"
DESCRIPTION = "This is the Fortran compiler of the GNU Compiler Collection (GCC)."
LICENSE = "GPL-3.0-or-later"

PV = "13.2.1+git7683"

RPM_NAME = "gcc13-fortran-13.2.1+git7683-1.1.aarch64.rpm"
RPM_HASH = "a81936a3a1b7c224ae0d4d794a79c917b92379d435b6aaa3afc13d4698b95665e70110706c140d0729b2debace890b1d84abe90ca896bf55877464ab2fbe5114"

RPROVIDES:${PN} += "gcc13-fortran"

RDEPENDS:${PN} += "gcc13 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgfortran5 \
libgmp.so.10 \
libisl.so.23 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
