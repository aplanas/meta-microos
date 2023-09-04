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

RPM_NAME = "openmpi_1_10_7-gnu-hpc-devel-static-1.10.7-8.1.aarch64.rpm"
RPM_HASH = "735b957a8691c69b2bb140ae3e8355b78d9a95dc3d61eda18e635241963c15664edd8bb5e4079e465743f30ec3e51037283f0f752a98b6795343301f6b843041"

RPROVIDES:${PN} += "openmpi-1-10-7-gnu-hpc-devel-static"

RDEPENDS:${PN} += "openmpi-1-10-7-gnu-hpc-devel"

inherit rpm
