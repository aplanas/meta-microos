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

RPM_NAME = "openmpi5-docs-5.0.0-3.1.aarch64.rpm"
RPM_HASH = "7f5f7f77c15fab2c995ed52a6601367a2f88f5f0e29204ff60e10385c87aedb191b59d0db7ccc171ef03f7174aeac2597bd41fc8528b836fdc58178aeedce9f5"

RPROVIDES:${PN} += "openmpi5-docs"

RDEPENDS:${PN} += "openmpi5"

inherit rpm
