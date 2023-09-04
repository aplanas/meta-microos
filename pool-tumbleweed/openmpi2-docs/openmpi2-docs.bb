SUMMARY = "Documentation for Open MPI/SHMEM  version 2.1.6"
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

RPM_NAME = "openmpi2-docs-2.1.6-15.1.aarch64.rpm"
RPM_HASH = "98f7a7177342cf0a670ae81f5177aada01a5cd337fc162bf31299e38ec8033900a97c576b6dc0d53410fa25999ce4f8ab421c320da2d66347a03afc9f3d61f8d"

RPROVIDES:${PN} += "openmpi2-docs"

RDEPENDS:${PN} += "openmpi2"

inherit rpm
