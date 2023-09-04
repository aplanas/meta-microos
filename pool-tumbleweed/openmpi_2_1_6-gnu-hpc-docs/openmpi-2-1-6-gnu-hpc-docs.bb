SUMMARY = "Documentation for Open MPI/SHMEM HPC version 2.1.6"
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

RPM_NAME = "openmpi_2_1_6-gnu-hpc-docs-2.1.6-15.1.aarch64.rpm"
RPM_HASH = "80376112a0937e8d58db64c6c1a42c0dddab86211c7586fa477b130b6176d5d5bc7efc0f12c7ff31f6dd8ccc48d54aab765602aac15d21525b461b398d7d3aaa"

RPROVIDES:${PN} += "openmpi-2-1-6-gnu-hpc-docs"

RDEPENDS:${PN} += "openmpi-2-1-6-gnu-hpc"

inherit rpm
