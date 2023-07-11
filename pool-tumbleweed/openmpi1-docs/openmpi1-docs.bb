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

RPM_NAME = "openmpi1-docs-1.10.7-7.6.aarch64.rpm"
RPM_HASH = "60432f9a2391439fef6a55df31e699cbca0236d300f04ad375395bdc417b494a157cd983cefe86b5da324d22909e9f384007c37af0fe58980bb8852a8a17300e"

RPROVIDES:${PN} += "openmpi1-docs"

RDEPENDS:${PN} += "openmpi1"

inherit rpm
