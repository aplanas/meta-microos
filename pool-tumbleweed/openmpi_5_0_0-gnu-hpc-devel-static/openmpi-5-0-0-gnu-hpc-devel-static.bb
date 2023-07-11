SUMMARY = "Static libraries for openMPI HPC version 5.0.0"
DESCRIPTION = "OpenMPI is an implementation of the Message Passing Interface, a \
standardized API typically used for parallel and/or distributed \
computing. OpenMPI is the merged result of four prior implementations \
where the team found for them to excel in one or more areas, \
such as latency or throughput. \
 \
This RPM contains the static library files, which are packaged separately from \
the dynamic library and headers."
LICENSE = "BSD-3-Clause"

PV = "5.0.0"

RPM_NAME = "openmpi_5_0_0-gnu-hpc-devel-static-5.0.0-2.4.aarch64.rpm"
RPM_HASH = "a1c2e53a785a55be3177a6b1d9e375fc2141de597b69ee4fcf608597562c677ccb3e2fe014fbba28eada5a7a4728f30633db009b0ecf7484d3ee7db671c0465a"

RPROVIDES:${PN} += "openmpi-5-0-0-gnu-hpc-devel-static"

RDEPENDS:${PN} += "openmpi-5-0-0-gnu-hpc-devel"

inherit rpm
