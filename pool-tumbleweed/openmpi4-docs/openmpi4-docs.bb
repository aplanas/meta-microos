SUMMARY = "Documentation for Open MPI/SHMEM  version 4.1.4"
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

PV = "4.1.4"

RPM_NAME = "openmpi4-docs-4.1.4-2.3.aarch64.rpm"
RPM_HASH = "66b8079c3aedb777f7f27f19147cfeeed601cf5798905df2593169fdba1e7a1b5d8acea256a3f514eeee7bbfb968943ed8740132f2b9ca040798a7acf9bb7419"

RPROVIDES:${PN} += "openmpi4-docs \
openmpi4-docs(aarch-64)"
RDEPENDS:${PN} += "openmpi4"

inherit rpm
