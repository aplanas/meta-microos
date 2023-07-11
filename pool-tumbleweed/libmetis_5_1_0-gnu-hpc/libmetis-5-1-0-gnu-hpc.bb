SUMMARY = "Serial Graph Partitioning and Fill-reducing Matrix Ordering library"
DESCRIPTION = "METIS library provides to partitioning unstructured graphs and hypergraph \
and computing fill-reducing orderings of sparse matrices. The underlying algorithms \
used by METIS are based on a multilevel paradigm that, at the time, had been \
shown to produce quality results and scale to large problems."
LICENSE = "Apache-2.0"

PV = "5.1.0"

RPM_NAME = "libmetis_5_1_0-gnu-hpc-5.1.0-9.12.aarch64.rpm"
RPM_HASH = "2b7627b764f799310de14abfd5480933f0a030c8e47d808ebce5e7d7c7df6092405d5115473a3a6ba33c8bb3c604bb4aeb0a06b21cebfe3f33dcf105b187786d"

RPROVIDES:${PN} += "libmetis-5-1-0-gnu-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgomp.so.1 \
libm.so.6"

inherit rpm
