SUMMARY = "Scalable algorithms for solving linear systems of equations"
DESCRIPTION = "Hypre is a library of preconditioners that feature parallel multigrid \
methods for both structured and unstructured grid problems arising in \
the simulation codes being developed at LLNL to study physical \
phenomena in the defense, environmental, energy, and biological \
sciences. \
 \
This package contains openmpi4 shared libraries of Hypre."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "libHYPRE_2_20_0-gnu-openmpi4-hpc-2.20.0-1.22.aarch64.rpm"
RPM_HASH = "402fb63801939b5cc34c4a6ca572cb084d202a9d716436f0048dd728ccf1f1039cdfcc2bbd33164d1a6298e8d8f38a2ecf95d0d9a098fc175a506838658e56eb"

RPROVIDES:${PN} += "libHYPRE_2_20_0-gnu-openmpi4-hpc \
libHYPRE_2_20_0-gnu-openmpi4-hpc(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libopenmpi4-gnu-hpc \
lua-lmod"

inherit rpm
