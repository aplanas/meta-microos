SUMMARY = "Static version of profiling library for MPI applications"
DESCRIPTION = "mpiP is a profiling library for MPI applications. \
 \
This package contains the static libraries."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP_3_5-gnu-mvapich2-hpc-devel-static-3.5-3.4.aarch64.rpm"
RPM_HASH = "8772605684d2a54a4ede942a4e6179096a3a90f2d1a79bf7bb8550d7b6147e36bc4719c91fc4137db82cd736a05248d6d359ed7495213a9f646bdebf33b8df42"

RPROVIDES:${PN} += "mpiP-3-5-gnu-mvapich2-hpc-devel-static"

RDEPENDS:${PN} += "gnu-compilers-hpc-devel \
mvapich2-gnu-hpc-devel"

inherit rpm
