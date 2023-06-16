SUMMARY = "Graph, mesh and hypergraph partitioning library"
DESCRIPTION = "Scotch is a software package for graph and mesh/hypergraph partitioning and \
sparse matrix ordering."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "libptscotch0-mvapich2-6.1.0-2.9.aarch64.rpm"
RPM_HASH = "e4b9881e205137093a077b1984efdba775853db648a51f574107c8e9452dc7e4c7af0d27296d659d9309a16d3baa40563a1e572dfb10bee16a450bf579c4938b"

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
