SUMMARY = "Serial Graph Partitioning and Fill-reducing Matrix Ordering"
DESCRIPTION = "METIS is a family of programs for partitioning unstructured graphs and hypergraph \
and computing fill-reducing orderings of sparse matrices. The underlying algorithms \
used by METIS are based on a multilevel paradigm that, at the time, had been \
shown to produce quality results and scale to large problems."
LICENSE = "Apache-2.0"

PV = "5.1.0"

RPM_NAME = "metis-5.1.0-9.12.aarch64.rpm"
RPM_HASH = "4ab1f7e2e0dc584df69f85544e16634e62dc4324be620ce94e4590cc96ac89a01cc5ff75ae5ed53f8093bda23d1cb89175dd18988bc3c907420440fdc8023930"

RPROVIDES:${PN} += "metis"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmetis.so.5"

inherit rpm
