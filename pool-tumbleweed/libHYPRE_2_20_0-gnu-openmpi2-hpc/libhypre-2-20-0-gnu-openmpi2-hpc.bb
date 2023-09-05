SUMMARY = "Scalable algorithms for solving linear systems of equations"
DESCRIPTION = "Hypre is a library of preconditioners that feature parallel multigrid \
methods for both structured and unstructured grid problems arising in \
the simulation codes being developed at LLNL to study physical \
phenomena in the defense, environmental, energy, and biological \
sciences. \
 \
This package contains openmpi2 shared libraries of Hypre."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "libHYPRE_2_20_0-gnu-openmpi2-hpc-2.20.0-1.24.aarch64.rpm"
RPM_HASH = "6b41894037dba7fea11c0d7420524a4c1c28c6d53d3c34b8525e7834e6e06438156f3a37920010d2cdb369fd59a13e5d071da62cc20126854708fd2eee5b2f24"

RPROVIDES:${PN} += "libHYPRE-2-20-0-gnu-openmpi2-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libopenmpi2-gnu-hpc \
lua-lmod"

inherit rpm
