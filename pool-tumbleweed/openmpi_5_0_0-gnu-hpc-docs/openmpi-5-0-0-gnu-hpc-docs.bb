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

RPM_NAME = "openmpi_5_0_0-gnu-hpc-docs-5.0.0-2.3.aarch64.rpm"
RPM_HASH = "a7981a0e9a8757ecafcb453f26943d5a7312da54fee31a1b16348014dc0e4fc22bc546a3dd0dddaac502409cab7202758fa48c2b8ad6824d6c122766f375d440"

RPROVIDES:${PN} += "openmpi_5_0_0-gnu-hpc-docs \
openmpi_5_0_0-gnu-hpc-docs(aarch-64)"

RDEPENDS:${PN} += "openmpi_5_0_0-gnu-hpc"

inherit rpm
