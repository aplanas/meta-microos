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

RPM_NAME = "ColPack-devel-1.0.10-1.24.aarch64.rpm"
RPM_HASH = "8e1d496b5bb9188912966ef8af74a37056d8a316a8d3c5c9d96ab5e17a85ab853ca914fac47499947ba31a9a8aeb897655c9851fd87150de446b283862348f45"

RPROVIDES:${PN} += "ColPack-devel \
ColPack-devel(aarch-64)"
RDEPENDS:${PN} += "libColPack0"

inherit rpm
