SUMMARY = "Static version of profiling library for MPI applications"
DESCRIPTION = "mpiP is a profiling library for MPI applications. \
 \
This package contains the static libraries."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP_3_5-gnu-openmpi4-hpc-devel-static-3.5-3.3.aarch64.rpm"
RPM_HASH = "629efde5b1afb837f4169752ade0f89c9539cb262872ed84cdd68368fa6805b00a152436649f1adec5793092b8de90562f9e09b269474917762defff9c9d69ca"

RPROVIDES:${PN} += "mpiP-3-5-gnu-openmpi4-hpc-devel-static"

RDEPENDS:${PN} += "gnu-compilers-hpc-devel \
openmpi4-gnu-hpc-devel"

inherit rpm
