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

RPM_NAME = "openmpi_2_1_6-gnu-hpc-docs-2.1.6-14.4.aarch64.rpm"
RPM_HASH = "6498f0fb010ae2d8879659a5a29d18fef40bc525a1ea89340483807ffcfebb4dac11c8e6629303c33c04bf71f566bcd241d1b1f10578c55db287be8361fd7612"

RPROVIDES:${PN} += "openmpi-2-1-6-gnu-hpc-docs"

RDEPENDS:${PN} += "openmpi-2-1-6-gnu-hpc"

inherit rpm
