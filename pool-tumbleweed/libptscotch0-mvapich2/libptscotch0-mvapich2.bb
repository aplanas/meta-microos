SUMMARY = "Graph, mesh and hypergraph partitioning library"
DESCRIPTION = "Scotch is a software package for graph and mesh/hypergraph partitioning and \
sparse matrix ordering."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "libptscotch0-mvapich2-6.1.0-2.9.aarch64.rpm"
RPM_HASH = "e4b9881e205137093a077b1984efdba775853db648a51f574107c8e9452dc7e4c7af0d27296d659d9309a16d3baa40563a1e572dfb10bee16a450bf579c4938b"

RPROVIDES:${PN} += "libptesmumps.so.0()(64bit) \
libptscotch.so.0()(64bit) \
libptscotch0-mvapich2 \
libptscotch0-mvapich2(aarch-64) \
libptscotcherr.so.0()(64bit) \
libptscotcherrexit.so.0()(64bit) \
libptscotchparmetis.so.0()(64bit)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libbz2.so.1()(64bit) \
libc.so.6()(64bit) \
libgfortran.so.5()(64bit) \
libm.so.6()(64bit) \
libmpi.so.12()(64bit) \
libscotch0 \
libz.so.1()(64bit)"

inherit rpm
