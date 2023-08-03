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

RPM_NAME = "openmpi_5_0_0-gnu-hpc-docs-5.0.0-3.1.aarch64.rpm"
RPM_HASH = "0c447a7ac1b053266ae80382c8e328f912d30548124ff472d56c280c99825896993f838bdda14096f8527e20553b566558a239fe20a7e76e23a560f14c1201ce"

RPROVIDES:${PN} += "openmpi-5-0-0-gnu-hpc-docs"

RDEPENDS:${PN} += "openmpi-5-0-0-gnu-hpc"

inherit rpm
