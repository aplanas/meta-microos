SUMMARY = "Metis development files"
DESCRIPTION = "METIS library provides to partitioning unstructured graphs and hypergraph \
and computing fill-reducing orderings of sparse matrices. The underlying algorithms \
used by METIS are based on a multilevel paradigm that, at the time, had been \
shown to produce quality results and scale to large problems. \
 \
This package provides development files."
LICENSE = "Apache-2.0"

PV = "5.1.0"

RPM_NAME = "metis_5_1_0-gnu-hpc-devel-5.1.0-9.12.aarch64.rpm"
RPM_HASH = "526d7ac90ed09e44e8b8ec7fdb495f6fdc94517e2f78d31b9855a0b1a51d80e4f66d5e31224b9d2a58a244ed80a315c927ef01d6fd124937d321ef79824e8ac8"

RPROVIDES:${PN} += "metis-5-1-0-gnu-hpc-devel"

RDEPENDS:${PN} += "gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgomp.so.1 \
libm.so.6 \
libmetis-5-1-0-gnu-hpc"

inherit rpm
