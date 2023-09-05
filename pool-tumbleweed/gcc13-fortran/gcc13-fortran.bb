SUMMARY = "The GNU Fortran Compiler and Support Files"
DESCRIPTION = "This is the Fortran compiler of the GNU Compiler Collection (GCC)."
LICENSE = "GPL-3.0-or-later"

PV = "13.2.1+git7683"

RPM_NAME = "gcc13-fortran-13.2.1+git7683-2.1.aarch64.rpm"
RPM_HASH = "46c8273ca1d1d7a696678f3892a60f1f87ec4938527cba100f08845fe2d8686e63f361a896e136cdc7fc18f4cf81855a1e623d978f2f4305b7e55d8cb8942303"

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
