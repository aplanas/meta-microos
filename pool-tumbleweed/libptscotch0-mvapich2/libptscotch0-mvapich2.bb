SUMMARY = "Graph, mesh and hypergraph partitioning library"
DESCRIPTION = "Scotch is a software package for graph and mesh/hypergraph partitioning and \
sparse matrix ordering."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "libptscotch0-mvapich2-6.1.0-2.10.aarch64.rpm"
RPM_HASH = "7329f93c9c093b4faf8c9dd31f1125fdadb03b1dddeea9c303cf1c4511446e76f08778879b94a9c7934757401d8234d9d38f499f3ea6daefa6a81ddfefe38112"

RPROVIDES:${PN} += "libptesmumps.so.0 \
libptscotch.so.0 \
libptscotch0-mvapich2 \
libptscotcherr.so.0 \
libptscotcherrexit.so.0 \
libptscotchparmetis.so.0"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libgfortran.so.5 \
libm.so.6 \
libmpi.so.12 \
libscotch0 \
libz.so.1"

inherit rpm
