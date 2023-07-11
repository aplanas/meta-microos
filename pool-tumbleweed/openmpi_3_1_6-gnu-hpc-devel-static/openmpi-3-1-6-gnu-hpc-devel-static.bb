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

RPM_NAME = "openmpi_3_1_6-gnu-hpc-devel-static-3.1.6-7.3.aarch64.rpm"
RPM_HASH = "15d7b640b521089faeba3f22e1b2a29219514adc43b01c4449bb16a64a437fc224748b5444423332e1a4e417bb3a515478d9c011e3e67bd1c84dfed15c6bceae"

RPROVIDES:${PN} += "openmpi-3-1-6-gnu-hpc-devel-static"

RDEPENDS:${PN} += "openmpi-3-1-6-gnu-hpc-devel"

inherit rpm
