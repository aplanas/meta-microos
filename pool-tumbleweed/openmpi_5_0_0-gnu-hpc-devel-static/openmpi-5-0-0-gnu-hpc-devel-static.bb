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

RPM_NAME = "openmpi_5_0_0-gnu-hpc-devel-static-5.0.0-2.3.aarch64.rpm"
RPM_HASH = "4e516b1f66be67c2cb306fbc088ba176676709cb4cdd09dbe93eaba99a8b6956f5051546a23239b48b15ee65468c04d2abf3f694f5c00526ef0b66c41751d78f"

RPROVIDES:${PN} += "openmpi_5_0_0-gnu-hpc-devel-static \
openmpi_5_0_0-gnu-hpc-devel-static(aarch-64)"

RDEPENDS:${PN} += "openmpi_5_0_0-gnu-hpc-devel"

inherit rpm
