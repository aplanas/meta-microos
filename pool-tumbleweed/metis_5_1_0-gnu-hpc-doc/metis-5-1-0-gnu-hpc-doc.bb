SUMMARY = "Metis documentation"
DESCRIPTION = "METIS is a family of programs for partitioning unstructured graphs and hypergraph \
and computing fill-reducing orderings of sparse matrices. The underlying algorithms \
used by METIS are based on a multilevel paradigm that, at the time, had been \
shown to produce quality results and scale to large problems."
LICENSE = "Apache-2.0"

PV = "5.1.0"

RPM_NAME = "metis_5_1_0-gnu-hpc-doc-5.1.0-9.11.noarch.rpm"
RPM_HASH = "d0f7c95e85d76be957070f6a3a0cb83b9aa4fdf817d39440791d57b28259ae0fc37507fb0a554b56f1a898e07d10b5fcf74d2d4d3f0fa37e57996cc3a59611d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "metis_5_1_0-gnu-hpc-doc"

RDEPENDS:${PN} += ""

inherit rpm
