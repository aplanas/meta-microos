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

RPM_NAME = "openmpi5-docs-5.0.0-2.4.aarch64.rpm"
RPM_HASH = "7a1f664a57fe5571c72afb3da24c3e02b9b5d1803dd7455cf3bca026854ba7e7683bf80aabbb8cd29d22c91dfd476accc8896d86801838304a3cb17079e5cbfb"

RPROVIDES:${PN} += "openmpi5-docs"

RDEPENDS:${PN} += "openmpi5"

inherit rpm
