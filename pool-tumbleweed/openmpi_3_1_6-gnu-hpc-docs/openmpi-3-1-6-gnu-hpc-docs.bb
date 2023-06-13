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

RPM_NAME = "openmpi_3_1_6-gnu-hpc-docs-3.1.6-7.2.aarch64.rpm"
RPM_HASH = "fea47573c0363f191cab3f954cff0b1d037db6e44dee2d4e96cf00bb6931e6284abb5a9e0d10a3954ee6f026cb66e17d5eafdd86c899da5164299310f98b4f4a"

RPROVIDES:${PN} += "openmpi_3_1_6-gnu-hpc-docs \
openmpi_3_1_6-gnu-hpc-docs(aarch-64)"

RDEPENDS:${PN} += "openmpi_3_1_6-gnu-hpc"

inherit rpm
