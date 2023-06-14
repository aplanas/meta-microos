SUMMARY = "Metis development files"
DESCRIPTION = "METIS library provides to partitioning unstructured graphs and hypergraph \
and computing fill-reducing orderings of sparse matrices. The underlying algorithms \
used by METIS are based on a multilevel paradigm that, at the time, had been \
shown to produce quality results and scale to large problems. \
 \
This package provides development files."
LICENSE = "Apache-2.0"

PV = "5.1.0"

RPM_NAME = "metis-devel-5.1.0-9.11.aarch64.rpm"
RPM_HASH = "a8ac5fc740be8afb9a27550ee3f67ee9daab7112c24e3f6106782e696675668a564e364299342ef7eb5d2f0a37c63280fb6806c8efa9a232508a39706b3263b4"

RPROVIDES:${PN} += "metis-devel"

RDEPENDS:${PN} += "libmetis5"

inherit rpm
