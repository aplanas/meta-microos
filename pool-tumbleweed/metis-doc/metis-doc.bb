SUMMARY = "Metis documentation"
DESCRIPTION = "METIS is a family of programs for partitioning unstructured graphs and hypergraph \
and computing fill-reducing orderings of sparse matrices. The underlying algorithms \
used by METIS are based on a multilevel paradigm that, at the time, had been \
shown to produce quality results and scale to large problems."
LICENSE = "Apache-2.0"

PV = "5.1.0"

RPM_NAME = "metis-doc-5.1.0-9.12.noarch.rpm"
RPM_HASH = "4fcc0a50f25aec0b7d77fd810271a15812ab91c3dcc372c58f0af27011edfb92e5ec87b8165e574583e8a56da88acc25b1415bfac16442c9f3e32c522be25365"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "metis-doc"

RDEPENDS:${PN} += ""

inherit rpm
