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

RPM_NAME = "libHYPRE_2_20_0-gnu-mvapich2-hpc-2.20.0-1.22.aarch64.rpm"
RPM_HASH = "f498d786db5b8f9e2b88b2629d49773dc90afdb7d44b118fb2f474db5057714a9bb6663a24dea8fc93286223426698a06a08dc3856dceacf246005e2539107b3"

RPROVIDES:${PN} += "libHYPRE_2_20_0-gnu-mvapich2-hpc \
libHYPRE_2_20_0-gnu-mvapich2-hpc(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
lua-lmod \
mvapich2-gnu-hpc"

inherit rpm
