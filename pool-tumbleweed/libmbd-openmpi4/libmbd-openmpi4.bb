SUMMARY = "Many-body dispersion library"
DESCRIPTION = "Libmbd implements the many-body dispersion (MBD) method in several programming \
languages and frameworks. This is the reference implementation in Fortran and \
C."
LICENSE = "MPL-2.0"

PV = "0.12.6"

RPM_NAME = "libmbd-openmpi4-0.12.6-1.4.aarch64.rpm"
RPM_HASH = "aca310a164f3927d8455caacf950305e051e9c6087830df3c0bc57687bf745c7be76f448f8c833f0c903b06723637ef7ecd37903f4871ea38f95735e14418388"

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
