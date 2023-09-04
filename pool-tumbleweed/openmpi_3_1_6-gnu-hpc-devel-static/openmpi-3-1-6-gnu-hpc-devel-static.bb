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

RPM_NAME = "openmpi_3_1_6-gnu-hpc-devel-static-3.1.6-8.1.aarch64.rpm"
RPM_HASH = "4cbc0aa64b6e6321b74507a2868eaf0673032ffc4e25813f5fd7b04617c1651bc91715995afc8ac95d47dd9f5555d80cd011fabdd73949a44d262be9f10c30da"

RPROVIDES:${PN} += "openmpi-3-1-6-gnu-hpc-devel-static"

RDEPENDS:${PN} += "openmpi-3-1-6-gnu-hpc-devel"

inherit rpm
