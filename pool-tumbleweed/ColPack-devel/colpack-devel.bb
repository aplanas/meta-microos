SUMMARY = "Graph Coloring Library for C/C++ -- development files"
DESCRIPTION = "This package provides algorithms for efficient solution of partitioning \
problems occuring in the analysis of sparsity patterns in derivative \
computations formulated as Graph Coloring problems. \
 \
For details see http://www.cscapes.org/coloringpage/software.htm \
 \
This package provides the development environment for ColPack"
LICENSE = "LGPL-3.0"

PV = "1.0.10"

RPM_NAME = "ColPack-devel-1.0.10-1.25.aarch64.rpm"
RPM_HASH = "ec4da6ff9fc52c0e1b00ec66c1496cbf5cc324950e69774c05827f77a4fd5046217a3cb80d5916b00fe415d22310d647a025ce4e473cec1cd2b89a50aee07ece"

RPROVIDES:${PN} += "ColPack-devel"

RDEPENDS:${PN} += "libColPack0"

inherit rpm
