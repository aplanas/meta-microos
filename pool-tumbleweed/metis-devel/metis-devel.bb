SUMMARY = "Metis development files"
DESCRIPTION = "METIS library provides to partitioning unstructured graphs and hypergraph \
and computing fill-reducing orderings of sparse matrices. The underlying algorithms \
used by METIS are based on a multilevel paradigm that, at the time, had been \
shown to produce quality results and scale to large problems. \
 \
This package provides development files."
LICENSE = "Apache-2.0"

PV = "5.1.0"

RPM_NAME = "metis-devel-5.1.0-9.12.aarch64.rpm"
RPM_HASH = "c86cf1020f10f144a9f07542ce915c6e2ae1832e2862017c6a43378dc9cea9fb636033982a97adbc0354093e33fbfb396132efac0bb0440aa5c9b5ce283c1bba"

RPROVIDES:${PN} += "metis-devel"

RDEPENDS:${PN} += "libmetis5"

inherit rpm
