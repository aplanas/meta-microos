SUMMARY = "Documentation for Open MPI/SHMEM HPC version 4.1.4"
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

PV = "4.1.4"

RPM_NAME = "openmpi_4_1_4-gnu-hpc-docs-4.1.4-2.3.aarch64.rpm"
RPM_HASH = "184bde430be4a57393fd2c79bb4948b45b051d4a4d2dd8bb0073a0974dcb68391ca90118cbaa7db09a8dbc014ac13d3671c0a6d737fd05ca03709deed41d085c"

RPROVIDES:${PN} += "openmpi-4-1-4-gnu-hpc-docs"

RDEPENDS:${PN} += "openmpi-4-1-4-gnu-hpc"

inherit rpm
