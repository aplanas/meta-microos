SUMMARY = "Static libraries for openMPI HPC version 4.1.5"
DESCRIPTION = "OpenMPI is an implementation of the Message Passing Interface, a \
standardized API typically used for parallel and/or distributed \
computing. OpenMPI is the merged result of four prior implementations \
where the team found for them to excel in one or more areas, \
such as latency or throughput. \
 \
This RPM contains the static library files, which are packaged separately from \
the dynamic library and headers."
LICENSE = "BSD-3-Clause"

PV = "4.1.5"

RPM_NAME = "openmpi_4_1_5-gnu-hpc-devel-static-4.1.5-2.1.aarch64.rpm"
RPM_HASH = "359ad4aec8b280a09c7404bb2bd021702e8ea58750efdd5284c4b62ba6ed2cbb5adfed3ee1b24d45667d0bfb406b1ba71d7fca6576546e2764cc78e324ee785c"

RPROVIDES:${PN} += "openmpi-4-1-5-gnu-hpc-devel-static"

RDEPENDS:${PN} += "openmpi-4-1-5-gnu-hpc-devel"

inherit rpm
