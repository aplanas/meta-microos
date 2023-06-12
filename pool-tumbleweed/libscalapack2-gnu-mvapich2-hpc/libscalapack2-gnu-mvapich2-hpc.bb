SUMMARY = "Dependency package for libscalapack2_2_1_0-gnu-mvapich2-hpc"
DESCRIPTION = "scalapack: A subset of LAPACK routines redesigned for heterogenous computing \
The package libscalapack2-gnu-mvapich2-hpc provides the dependency to get binary package libscalapack2_2_1_0-gnu-mvapich2-hpc. \
When this package gets updated it installs the latest version of scalapack_2_1_0-gnu-mvapich2-hpc."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libscalapack2-gnu-mvapich2-hpc-2.1.0-9.20.aarch64.rpm"
RPM_HASH = "e8c00970f525812a1e4c2d3ff5b9b2969e3d6f50c7bc7bb79418ec60e38035af1676fa3bd11513369d46bbf94da93d1f1af5ee78c3f5a0fcc46ae693b2a9c907"

RPROVIDES:${PN} += "libscalapack2-gnu-mvapich2-hpc \
libscalapack2-gnu-mvapich2-hpc(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
libscalapack2_2_1_0-gnu-mvapich2-hpc"

inherit rpm
