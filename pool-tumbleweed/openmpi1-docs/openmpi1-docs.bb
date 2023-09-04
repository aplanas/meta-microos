SUMMARY = "Documentation for Open MPI/SHMEM  version 1.10.7"
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

RPM_NAME = "openmpi1-docs-1.10.7-8.1.aarch64.rpm"
RPM_HASH = "6679ab20c3c89b3f19973836c3aea21aeaf1f36e28adbbf867c0eac4da7b4c21ec4a502190f3115135183904cfadf8ce931931350b1ec40a0ecb06169bff2e0a"

RPROVIDES:${PN} += "openmpi1-docs"

RDEPENDS:${PN} += "openmpi1"

inherit rpm
