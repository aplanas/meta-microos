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

RPM_NAME = "openmpi_4_1_4-gnu-hpc-devel-static-4.1.4-2.3.aarch64.rpm"
RPM_HASH = "e1b1ef240bd0c40084eb334253b42d6cacf9f6731eba374fd6c747e8787f6aba2cb2db887df78698a7cdba89fda82c82a597712b58490513884bcaf6b2ae1a2e"

RPROVIDES:${PN} += "openmpi-4-1-4-gnu-hpc-devel-static"

RDEPENDS:${PN} += "openmpi-4-1-4-gnu-hpc-devel"

inherit rpm
