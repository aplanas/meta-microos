SUMMARY = "Documentation for Open MPI/SHMEM HPC version 1.10.7"
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

PV = "1.10.7"

RPM_NAME = "openmpi_1_10_7-gnu-hpc-docs-1.10.7-8.1.aarch64.rpm"
RPM_HASH = "7ed83b0ced7d8ad98358c3bb04d9f43f99ab00074d6882f37795e5e9e2820ad247e912d9f17f7de23ea314d58e7be20e3bb02fca7ce7d02421e84ce529d360c4"

RPROVIDES:${PN} += "openmpi-1-10-7-gnu-hpc-docs"

RDEPENDS:${PN} += "openmpi-1-10-7-gnu-hpc"

inherit rpm
