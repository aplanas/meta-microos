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

RPM_NAME = "openmpi_5_0_0-gnu-hpc-devel-static-5.0.0-3.1.aarch64.rpm"
RPM_HASH = "6c123061d9e1f2a70a1340d7744a283127f4930389fe1b731d608c56a63c6f0e52a4d2443d87e83fe04245bb4160801c13f42959c41c3990429fd144dcf072b5"

RPROVIDES:${PN} += "openmpi-5-0-0-gnu-hpc-devel-static"

RDEPENDS:${PN} += "openmpi-5-0-0-gnu-hpc-devel"

inherit rpm
