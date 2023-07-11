SUMMARY = "Static version of profiling library for MPI applications"
DESCRIPTION = "mpiP is a profiling library for MPI applications. \
 \
This package contains the static libraries."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP_3_5-gnu-openmpi2-hpc-devel-static-3.5-3.4.aarch64.rpm"
RPM_HASH = "72500b890ce9ee7fe603aa1e0ece48c899f24d67e70128337d09f89c3f5f6e0de16877f49f517bb30b68259845f4e796382809aea5142b2c92dd1983b0f42bfa"

RPROVIDES:${PN} += "mpiP-3-5-gnu-openmpi2-hpc-devel-static"

RDEPENDS:${PN} += "gnu-compilers-hpc-devel \
openmpi2-gnu-hpc-devel"

inherit rpm
