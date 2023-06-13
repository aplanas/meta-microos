SUMMARY = "Metis development files"
DESCRIPTION = "METIS library provides to partitioning unstructured graphs and hypergraph \
and computing fill-reducing orderings of sparse matrices. The underlying algorithms \
used by METIS are based on a multilevel paradigm that, at the time, had been \
shown to produce quality results and scale to large problems. \
 \
This package provides development files."
LICENSE = "Apache-2.0"

PV = "5.1.0"

RPM_NAME = "metis_5_1_0-gnu-hpc-devel-5.1.0-9.11.aarch64.rpm"
RPM_HASH = "c94f7ba093648c8dcca841b7ded2cc46a7c3aa650d7ee7bf9ef8422425d10d7fe53cbbf9a1406628a812b3819642e5e8df9fe683b5ae3e89b08550a58a78c58b"

RPROVIDES:${PN} += "metis_5_1_0-gnu-hpc-devel \
metis_5_1_0-gnu-hpc-devel(aarch-64)"

RDEPENDS:${PN} += "gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgomp.so.1()(64bit) \
libm.so.6()(64bit) \
libmetis_5_1_0-gnu-hpc"

inherit rpm
