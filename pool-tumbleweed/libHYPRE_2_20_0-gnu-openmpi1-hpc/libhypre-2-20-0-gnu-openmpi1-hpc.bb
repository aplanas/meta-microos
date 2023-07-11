SUMMARY = "Scalable algorithms for solving linear systems of equations"
DESCRIPTION = "Hypre is a library of preconditioners that feature parallel multigrid \
methods for both structured and unstructured grid problems arising in \
the simulation codes being developed at LLNL to study physical \
phenomena in the defense, environmental, energy, and biological \
sciences. \
 \
This package contains openmpi1 shared libraries of Hypre."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "libHYPRE_2_20_0-gnu-openmpi1-hpc-2.20.0-1.23.aarch64.rpm"
RPM_HASH = "040839cc3b8d75339c025bde0442bc4f4adc7ded0a08f214970a7b4718fd90679cb5f26b26a5d25ce9c0ed552b4f9e243e14ba5d4f7dc9adf1c31343fb6bc3ff"

RPROVIDES:${PN} += "libHYPRE-2-20-0-gnu-openmpi1-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libopenmpi1-gnu-hpc \
lua-lmod"

inherit rpm
