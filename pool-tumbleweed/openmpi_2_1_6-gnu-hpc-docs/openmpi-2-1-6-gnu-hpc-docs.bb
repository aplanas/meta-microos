SUMMARY = "Documentation for Open MPI/SHMEM HPC version 2.1.6"
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

PV = "2.1.6"

RPM_NAME = "openmpi_2_1_6-gnu-hpc-docs-2.1.6-14.3.aarch64.rpm"
RPM_HASH = "66427493d5d595e732855d275fb03d948e27eb81174b1f56506ead916a6e66435635208337c43bbd63e5d2bb1d67700ed4037e0b1c84532ab1822ee988a63afb"

RPROVIDES:${PN} += "openmpi_2_1_6-gnu-hpc-docs \
openmpi_2_1_6-gnu-hpc-docs(aarch-64)"

RDEPENDS:${PN} += "openmpi_2_1_6-gnu-hpc"

inherit rpm
