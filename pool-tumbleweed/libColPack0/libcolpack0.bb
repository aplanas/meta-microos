SUMMARY = "Graph Coloring Library for C/C++"
DESCRIPTION = "This package provides algorithms for efficient solution of partitioning \
problems occuring in the analysis of sparsity patterns in derivative \
computations formulated as Graph Coloring problems. \
 \
For details see http://www.cscapes.org/coloringpage/software.htm"
LICENSE = "LGPL-3.0"

PV = "1.0.10"

RPM_NAME = "libColPack0-1.0.10-1.24.aarch64.rpm"
RPM_HASH = "85c34fcf151f7d5c0a4dbe6a74cc713ecc1d1183d2b37ff83ca17a6e9b4cdb0a1ee48b2a17753c8fa8651198c5e89ab3aa5329f564875ce19af8874d5057fdc6"

RPROVIDES:${PN} += "libColPack.so.0 \
libColPack0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
