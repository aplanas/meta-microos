SUMMARY = "Development libraries for ScaLAPACK (mvapich2)"
DESCRIPTION = "This package contains development libraries for ScaLAPACK, compiled against mvapich2."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libscalapack2_2_1_0-gnu-mvapich2-hpc-devel-2.1.0-9.20.aarch64.rpm"
RPM_HASH = "58cc37e1cc21a5d4a10f6a5d49b35cd2945de90c1b7e3c02b49df2ca812fe6d15404f9471db4adda5649651f91d30308f121c65d7a0f913f5f1850f931f86fef"

RPROVIDES:${PN} += "libblacs2-2-1-0-gnu-mvapich2-hpc-devel \
libscalapack2-2-1-0-gnu-mvapich2-hpc-devel \
scalapack-2-1-0-gnu-mvapich2-hpc-devel"

RDEPENDS:${PN} += "gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
libopenblas-gnu-hpc-devel \
libscalapack2-2-1-0-gnu-mvapich2-hpc \
mvapich2-gnu-hpc-devel"

inherit rpm
