SUMMARY = "OpenMPI runtime libraries for OpenMPI HPC version 2.1.6"
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
This subpackage provides the OpenMPI shared libraries."
LICENSE = "BSD-3-Clause"

PV = "2.1.6"

RPM_NAME = "libopenmpi_2_1_6-gnu-hpc-2.1.6-14.3.aarch64.rpm"
RPM_HASH = "0541ffaa8480fdcb2d24c62538bea59efe9175b97f0220bc574ac36d1740a5c7c59f47c1f28eb4937bc7e9eed7ed1ae27aef2db046f67b6d1ff398ba744eccd4"

RPROVIDES:${PN} += "libopenmpi_2_1_6-gnu-hpc \
libopenmpi_2_1_6-gnu-hpc(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
gnu-compilers-hpc \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libibverbs.so.1()(64bit) \
libm.so.6()(64bit) \
librdmacm.so.1()(64bit) \
libucp.so.0()(64bit) \
lua-lmod \
openmpi_2_1_6-gnu-hpc"

inherit rpm
