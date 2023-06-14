SUMMARY = "Many-body dispersion library"
DESCRIPTION = "Libmbd implements the many-body dispersion (MBD) method in several programming \
languages and frameworks. This is the reference implementation in Fortran and \
C."
LICENSE = "MPL-2.0"

PV = "0.12.6"

RPM_NAME = "libmbd-openmpi4-0.12.6-1.3.aarch64.rpm"
RPM_HASH = "69082c9f26e74ee9dcca9cc990ebb01350468fb4430f8bebca69ad739ed184136b02650fb5f9901b17bead222ff963efede7c658b368d8c64536c4ac0dc6634d"

RPROVIDES:${PN} += "libmbd-openmpi4 \
libmbd.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libblas.so.3 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
liblapack.so.3 \
libm.so.6 \
libmpi-usempif08.so.40 \
libscalapack.so.2.1.0"

inherit rpm
