SUMMARY = "Static libraries for openMPI HPC version 1.10.7"
DESCRIPTION = "OpenMPI is an implementation of the Message Passing Interface, a \
standardized API typically used for parallel and/or distributed \
computing. OpenMPI is the merged result of four prior implementations \
where the team found for them to excel in one or more areas, \
such as latency or throughput. \
 \
This RPM contains the static library files, which are packaged separately from \
the dynamic library and headers."
LICENSE = "BSD-3-Clause"

PV = "1.10.7"

RPM_NAME = "openmpi_1_10_7-gnu-hpc-devel-static-1.10.7-7.6.aarch64.rpm"
RPM_HASH = "d8af66b245003099e7856997ce48768ea561ffc9c1b55ea8988311588474e0aefb6275989ca0e966e42e2e0e8dd0a8a15c579f4b78d0fe045194be3db37c0d18"

RPROVIDES:${PN} += "openmpi-1-10-7-gnu-hpc-devel-static"

RDEPENDS:${PN} += "openmpi-1-10-7-gnu-hpc-devel"

inherit rpm
