SUMMARY = "Static version of profiling library for MPI applications"
DESCRIPTION = "mpiP is a profiling library for MPI applications. \
 \
This package contains the static libraries."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP_3_5-gnu-openmpi4-hpc-devel-static-3.5-3.2.aarch64.rpm"
RPM_HASH = "6646a20a2d541eb9a52af24b413139d02c4dff4597b939d8e5196d06c07a2f50add51f545f91810c1b05f31acb3a54bb8043486016f17117d5bb125cf8bcb567"

RPROVIDES:${PN} += "mpiP_3_5-gnu-openmpi4-hpc-devel-static \
mpiP_3_5-gnu-openmpi4-hpc-devel-static(aarch-64)"

RDEPENDS:${PN} += "gnu-compilers-hpc-devel \
openmpi4-gnu-hpc-devel"

inherit rpm
