SUMMARY = "Documentation for Open MPI/SHMEM HPC version 5.0.0"
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

PV = "5.0.0"

RPM_NAME = "openmpi_5_0_0-gnu-hpc-docs-5.0.0-2.4.aarch64.rpm"
RPM_HASH = "e7d98f114da9196c2a68fc250e45bab3e1defbe6fbd8592e29f08d61c0a41f361a63b16d755eebf4903a5b897a9887b29c356b7468f718a89694e4148e3f1093"

RPROVIDES:${PN} += "openmpi-5-0-0-gnu-hpc-docs"

RDEPENDS:${PN} += "openmpi-5-0-0-gnu-hpc"

inherit rpm
