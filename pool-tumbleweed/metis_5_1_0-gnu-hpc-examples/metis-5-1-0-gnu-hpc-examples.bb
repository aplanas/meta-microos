SUMMARY = "Metis examples"
DESCRIPTION = "METIS library provides to partitioning unstructured graphs and hypergraph \
and computing fill-reducing orderings of sparse matrices. This package provides \
graph files you can use to test Metis."
LICENSE = "Apache-2.0"

PV = "5.1.0"

RPM_NAME = "metis_5_1_0-gnu-hpc-examples-5.1.0-9.12.noarch.rpm"
RPM_HASH = "ddbbfc214b5231f26935db69fdcb8c184a2415fdf827f17e02b89be1e5dd0ac4488c653869abcafb223b9ba2c4112f52358c655def2756de145afe18e86169e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "metis-5-1-0-gnu-hpc-examples"

RDEPENDS:${PN} += ""

inherit rpm
