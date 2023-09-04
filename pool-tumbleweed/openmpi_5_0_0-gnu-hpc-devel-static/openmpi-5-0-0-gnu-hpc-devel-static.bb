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

RPM_NAME = "openmpi_5_0_0-gnu-hpc-devel-static-5.0.0-4.1.aarch64.rpm"
RPM_HASH = "00e09c7d6b6963e715b995e182cd6a6d36b63eb451436dd5692435095614caa50e84504fbc56010b78779c7d550e2bc40b66d201fdcdcb89e52463a2c551d3c0"

RPROVIDES:${PN} += "openmpi-5-0-0-gnu-hpc-devel-static"

RDEPENDS:${PN} += "openmpi-5-0-0-gnu-hpc-devel"

inherit rpm
