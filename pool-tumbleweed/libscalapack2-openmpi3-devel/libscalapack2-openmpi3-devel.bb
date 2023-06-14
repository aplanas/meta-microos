SUMMARY = "Development libraries for ScaLAPACK (openmpi3)"
DESCRIPTION = "This package contains development libraries for ScaLAPACK, compiled against openmpi3."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libscalapack2-openmpi3-devel-2.1.0-9.11.aarch64.rpm"
RPM_HASH = "77463998189b32aa25a8f9da39af220a850ef228d0275cdd820c9a821b76cd94ea5f410136b86d1effa1f0f46ac407cbf48d7114a115ad60aada5afa244db048"

RPROVIDES:${PN} += "libscalapack.so.2.1.0 \
libscalapack2-openmpi3-devel \
scalapack-openmpi3-devel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
libmpi.so.40 \
libscalapack2-openmpi3 \
openmpi3-devel"

inherit rpm
