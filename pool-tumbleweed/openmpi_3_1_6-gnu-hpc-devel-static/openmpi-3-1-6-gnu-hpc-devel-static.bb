SUMMARY = "Static libraries for openMPI HPC version 3.1.6"
DESCRIPTION = "OpenMPI is an implementation of the Message Passing Interface, a \
standardized API typically used for parallel and/or distributed \
computing. OpenMPI is the merged result of four prior implementations \
where the team found for them to excel in one or more areas, \
such as latency or throughput. \
 \
This RPM contains the static library files, which are packaged separately from \
the dynamic library and headers."
LICENSE = "BSD-3-Clause"

PV = "3.1.6"

RPM_NAME = "openmpi_3_1_6-gnu-hpc-devel-static-3.1.6-7.2.aarch64.rpm"
RPM_HASH = "032094d29203251b0c8341b1c40ed6aa2405b6d011c53583e354a466f99637af734699bbd761eac4239dd21fad54946f1b8e4eb0775ae60c60b01a3c32f39c9c"

RPROVIDES:${PN} += "openmpi_3_1_6-gnu-hpc-devel-static \
openmpi_3_1_6-gnu-hpc-devel-static(aarch-64)"

RDEPENDS:${PN} += "openmpi_3_1_6-gnu-hpc-devel"

inherit rpm
