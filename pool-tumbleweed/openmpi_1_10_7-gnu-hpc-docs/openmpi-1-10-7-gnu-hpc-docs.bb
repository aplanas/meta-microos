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

RPM_NAME = "openmpi_1_10_7-gnu-hpc-docs-1.10.7-7.6.aarch64.rpm"
RPM_HASH = "e5d6c908faa0882e7be8a00d08775d7859915c5bd446a86f0350b8c2cfde718128e893c0b5ab10a4cb489892044aa387c2b3ce4c52b801701b87cd2bcf3fee7f"

RPROVIDES:${PN} += "openmpi-1-10-7-gnu-hpc-docs"

RDEPENDS:${PN} += "openmpi-1-10-7-gnu-hpc"

inherit rpm
