SUMMARY = "Static libraries for ScaLAPACK (mvapich2)"
DESCRIPTION = "This package contains static libraries for ScaLAPACK, compiled against mvapich2."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libscalapack2_2_1_0-gnu-mvapich2-hpc-devel-static-2.1.0-9.20.aarch64.rpm"
RPM_HASH = "ed7d35b6db2a94a5348e5abd0b5162a7f82cbf00a2a2ca59c32585a1929a84453c7d06bb699b8187ab1e5905cca92e45495bb1d544ee8f7c6eaa4139f0c5ecbd"

RPROVIDES:${PN} += "libscalapack2-2-1-0-gnu-mvapich2-hpc-devel-static \
scalapack-2-1-0-gnu-mvapich2-hpc-devel-static"

RDEPENDS:${PN} += "libscalapack2-2-1-0-gnu-mvapich2-hpc-devel"

inherit rpm
