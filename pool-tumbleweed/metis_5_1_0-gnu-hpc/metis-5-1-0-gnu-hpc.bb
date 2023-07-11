SUMMARY = "Serial Graph Partitioning and Fill-reducing Matrix Ordering"
DESCRIPTION = "METIS is a family of programs for partitioning unstructured graphs and hypergraph \
and computing fill-reducing orderings of sparse matrices. The underlying algorithms \
used by METIS are based on a multilevel paradigm that, at the time, had been \
shown to produce quality results and scale to large problems."
LICENSE = "Apache-2.0"

PV = "5.1.0"

RPM_NAME = "metis_5_1_0-gnu-hpc-5.1.0-9.12.aarch64.rpm"
RPM_HASH = "231271041313b1f12b36b0919dba8d0f0b55a258fe98c853434d8805278e990ab28a642598fcf6b93280445d18de973b9b8cbf672d3a3050c6536cbe40730a5b"

RPROVIDES:${PN} += "metis-5-1-0-gnu-hpc"

RDEPENDS:${PN} += "gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmetis-5-1-0-gnu-hpc \
lua-lmod"

inherit rpm
