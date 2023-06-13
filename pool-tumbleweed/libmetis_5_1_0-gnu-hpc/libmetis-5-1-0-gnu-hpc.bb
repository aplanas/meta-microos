SUMMARY = "Serial Graph Partitioning and Fill-reducing Matrix Ordering library"
DESCRIPTION = "METIS library provides to partitioning unstructured graphs and hypergraph \
and computing fill-reducing orderings of sparse matrices. The underlying algorithms \
used by METIS are based on a multilevel paradigm that, at the time, had been \
shown to produce quality results and scale to large problems."
LICENSE = "Apache-2.0"

PV = "5.1.0"

RPM_NAME = "libmetis_5_1_0-gnu-hpc-5.1.0-9.11.aarch64.rpm"
RPM_HASH = "c9f97c04b3f2b612212a9863514c96aad15a3002ca0914b6cc27703b12046d5eaa760db5f51d38243c47c8f7bd92e9e50882d75861594dd8b62192780a731ec9"

RPROVIDES:${PN} += "libmetis_5_1_0-gnu-hpc \
libmetis_5_1_0-gnu-hpc(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgomp.so.1()(64bit) \
libm.so.6()(64bit)"

inherit rpm
