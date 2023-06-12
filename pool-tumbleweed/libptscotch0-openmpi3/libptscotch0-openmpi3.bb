SUMMARY = "Graph, mesh and hypergraph partitioning library"
DESCRIPTION = "Scotch is a software package for graph and mesh/hypergraph partitioning and \
sparse matrix ordering."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "libptscotch0-openmpi3-6.1.0-2.9.aarch64.rpm"
RPM_HASH = "8494992992337b03aefc7bfa86504927a10e2ef07b52c9afec2c7af07b750ccedbdea7392a1d220954d2045b2b3feedb66db426d17c380bc352c32f5c5f44cd2"

RPROVIDES:${PN} += "libptesmumps.so.0()(64bit) \
libptscotch.so.0()(64bit) \
libptscotch0-openmpi3 \
libptscotch0-openmpi3(aarch-64) \
libptscotcherr.so.0()(64bit) \
libptscotcherrexit.so.0()(64bit) \
libptscotchparmetis.so.0()(64bit)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbz2.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgfortran.so.5()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libmpi.so.40()(64bit) \
libscotch0 \
libz.so.1()(64bit)"

inherit rpm
