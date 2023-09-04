SUMMARY = "Documentation for Open MPI/SHMEM HPC version 4.1.5"
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

PV = "4.1.5"

RPM_NAME = "openmpi_4_1_5-gnu-hpc-docs-4.1.5-2.1.aarch64.rpm"
RPM_HASH = "e7183730def74502df1e813b354cbe21a6b91757952306e2bf38170806eac1c20cd57418064bb89b11c4c0cb7aa9fc3e68fc4900f3a1a16dce55025bd91ca79f"

RPROVIDES:${PN} += "openmpi-4-1-5-gnu-hpc-docs"

RDEPENDS:${PN} += "openmpi-4-1-5-gnu-hpc"

inherit rpm
