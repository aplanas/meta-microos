SUMMARY = "Static version of profiling library for MPI applications"
DESCRIPTION = "mpiP is a profiling library for MPI applications. \
 \
This package contains the static libraries."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP_3_5-gnu-openmpi1-hpc-devel-static-3.5-3.4.aarch64.rpm"
RPM_HASH = "b02388721df0412cdfe4f98d8928becefff3bc30a8310a90fc20726741339b52e8ee08e21a7d823e1b373e896c8d1c1ab34f016fd27453a62b3d4267d2bf09b6"

RPROVIDES:${PN} += "mpiP-3-5-gnu-openmpi1-hpc-devel-static"

RDEPENDS:${PN} += "gnu-compilers-hpc-devel \
openmpi1-gnu-hpc-devel"

inherit rpm
