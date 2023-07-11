SUMMARY = "Static libraries for openMPI HPC version 2.1.6"
DESCRIPTION = "OpenMPI is an implementation of the Message Passing Interface, a \
standardized API typically used for parallel and/or distributed \
computing. OpenMPI is the merged result of four prior implementations \
where the team found for them to excel in one or more areas, \
such as latency or throughput. \
 \
This RPM contains the static library files, which are packaged separately from \
the dynamic library and headers."
LICENSE = "BSD-3-Clause"

PV = "2.1.6"

RPM_NAME = "openmpi_2_1_6-gnu-hpc-devel-static-2.1.6-14.4.aarch64.rpm"
RPM_HASH = "2c4419973cf4fd1d1f543799247cac61a4e06b4a5a01e98e43552c572dc4daf26468b493d1bd6a04be01277de05ae69db04497820d8b8425109b7dcffff6f0c5"

RPROVIDES:${PN} += "openmpi-2-1-6-gnu-hpc-devel-static"

RDEPENDS:${PN} += "openmpi-2-1-6-gnu-hpc-devel"

inherit rpm
