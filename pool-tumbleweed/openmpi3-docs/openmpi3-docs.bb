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

RPM_NAME = "openmpi3-docs-3.1.6-7.4.aarch64.rpm"
RPM_HASH = "7f5b0c3715ce889635c3dd46b665933128d96df09116bc0b5e78d1b6143bac75804730ebfe77762a9bf3191c9a5dad678183fa10a49e4747455e4043fe4b483b"

RPROVIDES:${PN} += "openmpi3-docs"

RDEPENDS:${PN} += "openmpi3"

inherit rpm
