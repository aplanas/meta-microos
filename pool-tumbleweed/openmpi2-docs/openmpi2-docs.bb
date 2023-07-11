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

RPM_NAME = "openmpi2-docs-2.1.6-14.4.aarch64.rpm"
RPM_HASH = "c8a29a43d94ffb260e75f0300076663a1a054aaf92b653633a63da53376a6abb0a47504490ff2665c24f52a0178fd37e61ba58e92b478f5159c853ea6f05abee"

RPROVIDES:${PN} += "openmpi2-docs"

RDEPENDS:${PN} += "openmpi2"

inherit rpm
