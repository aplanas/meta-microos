SUMMARY = "Development libraries for ScaLAPACK (openmpi2)"
DESCRIPTION = "This package contains development libraries for ScaLAPACK, compiled against openmpi2."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libscalapack2-openmpi2-devel-2.1.0-9.12.aarch64.rpm"
RPM_HASH = "9cdb75340f6af07706f0d85d3241a5e514becacb9c0f736a7c453bead6e53a5efa361c97f675a9f1fe2c8e8f9cc00dd53bffb7164594bdeb4f8ceb2e105d9d09"

RPROVIDES:${PN} += "libscalapack.so.2.1.0 \
libscalapack2-openmpi2-devel \
scalapack-openmpi2-devel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
libmpi.so.20 \
libscalapack2-openmpi2 \
openmpi2-devel"

inherit rpm
