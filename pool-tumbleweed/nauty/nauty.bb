SUMMARY = "Tools for computing automorphism groups of graphs"
DESCRIPTION = "nauty and Traces are programs for computing automorphism groups of \
graphs and digraphs (*Traces does not accept digraphs at this time). \
They can also produce a canonical label. They are written in a \
portable subset of C, and run on a considerable number of different \
systems. \
 \
There is a small suite of programs called gtools included in the \
package. For example, geng can generate non-isomorphic graphs very \
quickly. There are also generators for bipartite graphs, digraphs, \
and multigraphs."
LICENSE = "Apache-2.0"

PV = "2.8.6"

RPM_NAME = "nauty-2.8.6-1.4.aarch64.rpm"
RPM_HASH = "05a36aade3bf4a43f42afb03acbbd2b57b685714b3d5b78454a841a819c0bd675d5b3cecd0faa3f61a4bee85daaa7de7ef42eacd0a9dbfa0afcaa4e76c994440"

RPROVIDES:${PN} += "nauty"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libnauty-2.8.6.so \
libnautyL1-2.8.6.so \
libnautyW1-2.8.6.so"

inherit rpm
