SUMMARY = "Development libraries for ScaLAPACK (openmpi3)"
DESCRIPTION = "This package contains development libraries for ScaLAPACK, compiled against openmpi3."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libscalapack2-openmpi3-devel-2.1.0-9.12.aarch64.rpm"
RPM_HASH = "3622a927ca95e27b08e8501ad249e1a2053f2e0eb49a32a635cd4c44d91baea4ec7dd5a810bf1073599f8a51f5e1c3b03b308af8ae73ffc8961a28230f7a1da6"

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
