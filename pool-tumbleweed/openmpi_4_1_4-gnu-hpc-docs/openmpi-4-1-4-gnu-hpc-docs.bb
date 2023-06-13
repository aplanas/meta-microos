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

RPM_NAME = "openmpi_4_1_4-gnu-hpc-docs-4.1.4-2.2.aarch64.rpm"
RPM_HASH = "733a6e964d259e75eb9e7c224deac315e3564f535daef92e5de5e10cf6f4b498949f22d61dc79bdf135ffa04a88f181b6c35dc729810563eef498c1368c07043"

RPROVIDES:${PN} += "openmpi_4_1_4-gnu-hpc-docs \
openmpi_4_1_4-gnu-hpc-docs(aarch-64)"

RDEPENDS:${PN} += "openmpi_4_1_4-gnu-hpc"

inherit rpm
