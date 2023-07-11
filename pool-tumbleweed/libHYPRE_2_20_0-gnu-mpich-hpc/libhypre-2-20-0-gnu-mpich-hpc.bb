SUMMARY = "Scalable algorithms for solving linear systems of equations"
DESCRIPTION = "Hypre is a library of preconditioners that feature parallel multigrid \
methods for both structured and unstructured grid problems arising in \
the simulation codes being developed at LLNL to study physical \
phenomena in the defense, environmental, energy, and biological \
sciences. \
 \
This package contains mpich shared libraries of Hypre."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "libHYPRE_2_20_0-gnu-mpich-hpc-2.20.0-1.24.aarch64.rpm"
RPM_HASH = "53062d220ef6c7170a1d8db97851f5ba7883f33db1aa6338c31598598b88977ce9b81e0d55938987a263c04f618ed6a7e2ac28dff900984e1f4286e3655a2d6b"

RPROVIDES:${PN} += "libHYPRE-2-20-0-gnu-mpich-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
lua-lmod \
mpich-gnu-hpc"

inherit rpm
