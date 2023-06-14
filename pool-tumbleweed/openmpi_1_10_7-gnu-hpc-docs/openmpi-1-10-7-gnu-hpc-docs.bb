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

RPM_NAME = "openmpi_1_10_7-gnu-hpc-docs-1.10.7-7.5.aarch64.rpm"
RPM_HASH = "2151a30c08160fc77207d01fdefa74d9912e35f86553fe4ee057fd7133b04815566bfad43572e0ca3c7744e8992018be878d5d342aa7e80c957bff223a26ac39"

RPROVIDES:${PN} += "openmpi-1-10-7-gnu-hpc-docs"

RDEPENDS:${PN} += "openmpi-1-10-7-gnu-hpc"

inherit rpm
