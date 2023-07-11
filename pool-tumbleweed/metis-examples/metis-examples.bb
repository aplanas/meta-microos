SUMMARY = "Metis examples"
DESCRIPTION = "METIS library provides to partitioning unstructured graphs and hypergraph \
and computing fill-reducing orderings of sparse matrices. This package provides \
graph files you can use to test Metis."
LICENSE = "Apache-2.0"

PV = "5.1.0"

RPM_NAME = "metis-examples-5.1.0-9.12.noarch.rpm"
RPM_HASH = "ddf0a7ffc9fe6cedbfb5744a20a38cb4415cf907827a54e64adda800fe33c4114871fee56c10702fe96a15ca3dc054845d36140fda8a2ead15c384b1a9059c8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "metis-examples"

RDEPENDS:${PN} += ""

inherit rpm
