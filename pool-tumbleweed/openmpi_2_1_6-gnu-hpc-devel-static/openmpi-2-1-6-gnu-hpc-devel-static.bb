SUMMARY = "Static libraries for openMPI HPC version 2.1.6"
DESCRIPTION = "OpenMPI is an implementation of the Message Passing Interface, a \
standardized API typically used for parallel and/or distributed \
computing. OpenMPI is the merged result of four prior implementations \
where the team found for them to excel in one or more areas, \
such as latency or throughput. \
 \
This RPM contains the static library files, which are packaged separately from \
the dynamic library and headers."
LICENSE = "BSD-3-Clause"

PV = "2.1.6"

RPM_NAME = "openmpi_2_1_6-gnu-hpc-devel-static-2.1.6-15.1.aarch64.rpm"
RPM_HASH = "574047177c07771ee455d32b6d876ef36de92f33ec0d4d0f2f8cf695de89ad67f8deb02c33487c0994369413062d811b19acc4e360915e478becd5da999969d5"

RPROVIDES:${PN} += "openmpi-2-1-6-gnu-hpc-devel-static"

RDEPENDS:${PN} += "openmpi-2-1-6-gnu-hpc-devel"

inherit rpm
