SUMMARY = "Documentation for Open MPI/SHMEM  version 3.1.6"
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

RPM_NAME = "openmpi3-docs-3.1.6-8.1.aarch64.rpm"
RPM_HASH = "860fa2db5c1ba70308ea2a5133057a024802af2bb88659d6a78a9c99d000b3578c4d7fea806d598822ef310111fc3c07baa6eb7285a04ea9792833752b791c0d"

RPROVIDES:${PN} += "openmpi3-docs"

RDEPENDS:${PN} += "openmpi3"

inherit rpm
