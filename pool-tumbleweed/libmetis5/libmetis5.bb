SUMMARY = "Serial Graph Partitioning and Fill-reducing Matrix Ordering library"
DESCRIPTION = "METIS library provides to partitioning unstructured graphs and hypergraph \
and computing fill-reducing orderings of sparse matrices. The underlying algorithms \
used by METIS are based on a multilevel paradigm that, at the time, had been \
shown to produce quality results and scale to large problems."
LICENSE = "Apache-2.0"

PV = "5.1.0"

RPM_NAME = "libmetis5-5.1.0-9.12.aarch64.rpm"
RPM_HASH = "aedf04998d8815e94ac3ad53ee4e1dddc59094fbfe6a1276373c939358f22b11d847e8fb8f7f4c69090af8403e5dbd8084c8233d12a123cfb9df89ac17dc9d37"

RPROVIDES:${PN} += "libmetis.so.5 \
libmetis5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgomp.so.1 \
libm.so.6"

inherit rpm
