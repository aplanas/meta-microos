SUMMARY = "Documentation for Open MPI/SHMEM  version 4.1.5"
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

PV = "4.1.5"

RPM_NAME = "openmpi4-docs-4.1.5-2.1.aarch64.rpm"
RPM_HASH = "ae3b5e95513589050a7a819cd38b8f087c3331f12042eaf772652cf02b5e39f0d992caf4eb7bea4cf75a007387f538bf6af818e15a6d66741b341919addfb2fb"

RPROVIDES:${PN} += "openmpi4-docs"

RDEPENDS:${PN} += "openmpi4"

inherit rpm
