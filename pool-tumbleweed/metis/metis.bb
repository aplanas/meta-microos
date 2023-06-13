SUMMARY = "Serial Graph Partitioning and Fill-reducing Matrix Ordering"
DESCRIPTION = "METIS is a family of programs for partitioning unstructured graphs and hypergraph \
and computing fill-reducing orderings of sparse matrices. The underlying algorithms \
used by METIS are based on a multilevel paradigm that, at the time, had been \
shown to produce quality results and scale to large problems."
LICENSE = "Apache-2.0"

PV = "5.1.0"

RPM_NAME = "metis-5.1.0-9.11.aarch64.rpm"
RPM_HASH = "3ec2764c22502fb9346ae14d75ad517993f65e333c518d7f275eeed6216c7dcf351b2d6c6a684fd18b278290b68ed4244c47985697806d135a366fdc61b67299"

RPROVIDES:${PN} += "metis \
metis(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libmetis.so.5()(64bit)"

inherit rpm
