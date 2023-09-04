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

RPM_NAME = "openmpi_5_0_0-gnu-hpc-docs-5.0.0-4.1.aarch64.rpm"
RPM_HASH = "78b8b02afab13ad45e2c8700cfaa9e2008b67a2df0bc21da0ee2271c89e05af685bae7ffc9ed7f4bed15e5fe0e9eab0806af77f5d6b432603881e1e78e980200"

RPROVIDES:${PN} += "openmpi-5-0-0-gnu-hpc-docs"

RDEPENDS:${PN} += "openmpi-5-0-0-gnu-hpc"

inherit rpm
