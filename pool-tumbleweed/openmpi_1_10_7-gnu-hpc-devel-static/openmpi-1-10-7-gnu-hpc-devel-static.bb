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

RPM_NAME = "openmpi_1_10_7-gnu-hpc-devel-static-1.10.7-7.5.aarch64.rpm"
RPM_HASH = "9fad9921b5ea9f9f56d9f3041284f65457ea80238eeb90a93d6701504ff580869694cccdbece80800a9d0b2252f81febb27015e02369f3a023780738926b7a6d"

RPROVIDES:${PN} += "openmpi_1_10_7-gnu-hpc-devel-static \
openmpi_1_10_7-gnu-hpc-devel-static(aarch-64)"

RDEPENDS:${PN} += "openmpi_1_10_7-gnu-hpc-devel"

inherit rpm
