SUMMARY = "Serial Graph Partitioning and Fill-reducing Matrix Ordering library"
DESCRIPTION = "METIS library provides to partitioning unstructured graphs and hypergraph \
and computing fill-reducing orderings of sparse matrices. The underlying algorithms \
used by METIS are based on a multilevel paradigm that, at the time, had been \
shown to produce quality results and scale to large problems."
LICENSE = "Apache-2.0"

PV = "5.1.0"

RPM_NAME = "libmetis5-5.1.0-9.11.aarch64.rpm"
RPM_HASH = "ac247a03e40c2201eea174176a98051328077bba4195f0b65d83d8638ed923976d14ba6ec251fa55736b9b6a39cdbb2e1124078ef6fc8d3bccb35e20acf09419"

RPROVIDES:${PN} += "libmetis.so.5 \
libmetis5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgomp.so.1 \
libm.so.6"

inherit rpm
