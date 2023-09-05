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

RPM_NAME = "libHYPRE_2_20_0-gnu-openmpi1-hpc-2.20.0-1.24.aarch64.rpm"
RPM_HASH = "b4d6acf92e1fe69de0ce536d3bc9b32c676825aea594445cf0c8cb76586bd44a29fff0f5fa624ab54a07a2d1c3d8d711549c7e3e2d49dfdcd21d369605a57129"

RPROVIDES:${PN} += "libHYPRE-2-20-0-gnu-openmpi1-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libopenmpi1-gnu-hpc \
lua-lmod"

inherit rpm
