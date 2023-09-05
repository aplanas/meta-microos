SUMMARY = "Scalable algorithms for solving linear systems of equations"
DESCRIPTION = "Hypre is a library of preconditioners that feature parallel multigrid \
methods for both structured and unstructured grid problems arising in \
the simulation codes being developed at LLNL to study physical \
phenomena in the defense, environmental, energy, and biological \
sciences. \
 \
This package contains mvapich2 shared libraries of Hypre."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "libHYPRE_2_20_0-gnu-mvapich2-hpc-2.20.0-1.24.aarch64.rpm"
RPM_HASH = "7b880ee8e680220dcffa53383b1890eed35013027295bb7ce936b17037cf6d980b525e408d251e0c00c44b56e746c460fed8dbf19eb839a4f47d41893ae70948"

RPROVIDES:${PN} += "libHYPRE-2-20-0-gnu-mvapich2-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
lua-lmod \
mvapich2-gnu-hpc"

inherit rpm
