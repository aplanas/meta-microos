SUMMARY = "Static libraries for openMPI HPC version 4.1.4"
DESCRIPTION = "OpenMPI is an implementation of the Message Passing Interface, a \
standardized API typically used for parallel and/or distributed \
computing. OpenMPI is the merged result of four prior implementations \
where the team found for them to excel in one or more areas, \
such as latency or throughput. \
 \
This RPM contains the static library files, which are packaged separately from \
the dynamic library and headers."
LICENSE = "BSD-3-Clause"

PV = "4.1.4"

RPM_NAME = "openmpi_4_1_4-gnu-hpc-devel-static-4.1.4-2.2.aarch64.rpm"
RPM_HASH = "0a4d82b4987c8e82ca7fcb8c9d02f817737c722d0fa6263f1d9df0d6e4460e29b767600c5e5e9e38d509d13ba6956be310a5af2d2771f6a7b956c3bc85b1492b"

RPROVIDES:${PN} += "openmpi_4_1_4-gnu-hpc-devel-static \
openmpi_4_1_4-gnu-hpc-devel-static(aarch-64)"

RDEPENDS:${PN} += "openmpi_4_1_4-gnu-hpc-devel"

inherit rpm
