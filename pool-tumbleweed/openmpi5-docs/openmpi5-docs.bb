SUMMARY = "Documentation for Open MPI/SHMEM  version 5.0.0"
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

RPM_NAME = "openmpi5-docs-5.0.0-4.1.aarch64.rpm"
RPM_HASH = "c6ea97741e68eb9c6b2ce9b9881db2273d2ba350a11c4c03c30f76cff97b80cfc4909e7a8440634d58216ed1e064e9f6f2cc84182c4b4d28d40a718c12009086"

RPROVIDES:${PN} += "openmpi5-docs"

RDEPENDS:${PN} += "openmpi5"

inherit rpm
