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

RPM_NAME = "openmpi_3_1_6-gnu-hpc-docs-3.1.6-7.3.aarch64.rpm"
RPM_HASH = "4c0941cb6eceb057483d4dd4304d956a87a6ca4d850d9d158a6aa1fbaeb81323c379167af957dd1691144857891de94b2b113c294c4190e03dcb1c365abfdf75"

RPROVIDES:${PN} += "openmpi-3-1-6-gnu-hpc-docs"

RDEPENDS:${PN} += "openmpi-3-1-6-gnu-hpc"

inherit rpm
