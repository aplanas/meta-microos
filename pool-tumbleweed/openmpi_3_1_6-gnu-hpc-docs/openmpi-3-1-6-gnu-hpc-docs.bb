SUMMARY = "Documentation for Open MPI/SHMEM HPC version 3.1.6"
DESCRIPTION = "OpenMPI is an implementation of the Message Passing Interface, a \
standardized API typically used for parallel and/or distributed \
computing. OpenMPI is the merged result of four prior implementations \
where the team found for them to excel in one or more areas, \
such as latency or throughput. \
 \
OpenMPI also includes an implementation of the OpenSHMEM parallel \
programming API, which is a Partitioned Global Address Space (PGAS) \
abstraction layer providing inter-process communication using \
one-sided communication techniques. \
 \
This subpackage provides the documentation for Open MPI/OpenSHMEM."
LICENSE = "BSD-3-Clause"

PV = "3.1.6"

RPM_NAME = "openmpi_3_1_6-gnu-hpc-docs-3.1.6-8.1.aarch64.rpm"
RPM_HASH = "705170549064763ed3a8e43c557cacad96fc3c560fedfb38fa1990a421e2d508f04b44b864af1badb450bb964d9460e7b73de96283877e8ee111027f2552c4e6"

RPROVIDES:${PN} += "openmpi-3-1-6-gnu-hpc-docs"

RDEPENDS:${PN} += "openmpi-3-1-6-gnu-hpc"

inherit rpm
