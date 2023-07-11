SUMMARY = "Metis documentation"
DESCRIPTION = "METIS is a family of programs for partitioning unstructured graphs and hypergraph \
and computing fill-reducing orderings of sparse matrices. The underlying algorithms \
used by METIS are based on a multilevel paradigm that, at the time, had been \
shown to produce quality results and scale to large problems."
LICENSE = "Apache-2.0"

PV = "5.1.0"

RPM_NAME = "metis_5_1_0-gnu-hpc-doc-5.1.0-9.12.noarch.rpm"
RPM_HASH = "44c1e5b75b58026286f03c324dbcab32bab2f64eefe2d22f9caed0782cfd18f24a648498bb2f4691647000583be7c898c766e2bb3f8cc364752f25eed49e3e11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "metis-5-1-0-gnu-hpc-doc"

RDEPENDS:${PN} += ""

inherit rpm
