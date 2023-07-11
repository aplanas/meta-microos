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

RPM_NAME = "openmpi4-docs-4.1.4-2.4.aarch64.rpm"
RPM_HASH = "9a5887731edd41b5cb063a260bd4bfeee858f64b1c3f81c5b533adbafe4fb11819034437e95f0c4293068129f7450dcfcdb96f2027a68aac689e33325cf17604"

RPROVIDES:${PN} += "openmpi4-docs"

RDEPENDS:${PN} += "openmpi4"

inherit rpm
