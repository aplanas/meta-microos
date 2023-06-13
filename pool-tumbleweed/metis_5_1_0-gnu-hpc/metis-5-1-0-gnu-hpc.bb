SUMMARY = "Serial Graph Partitioning and Fill-reducing Matrix Ordering"
DESCRIPTION = "METIS is a family of programs for partitioning unstructured graphs and hypergraph \
and computing fill-reducing orderings of sparse matrices. The underlying algorithms \
used by METIS are based on a multilevel paradigm that, at the time, had been \
shown to produce quality results and scale to large problems."
LICENSE = "Apache-2.0"

PV = "5.1.0"

RPM_NAME = "metis_5_1_0-gnu-hpc-5.1.0-9.11.aarch64.rpm"
RPM_HASH = "7cc0c2ceaeb170480c29a4f7706cf7066b216d8fc7f304bc6c28f10d2c83b088fd4cf0c7207d381012d75881158774119eb2f15c64e3880d15c321618fb15420"

RPROVIDES:${PN} += "metis_5_1_0-gnu-hpc \
metis_5_1_0-gnu-hpc(aarch-64)"

RDEPENDS:${PN} += "gnu-compilers-hpc \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libmetis_5_1_0-gnu-hpc \
lua-lmod"

inherit rpm
