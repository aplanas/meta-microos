SUMMARY = "Development headers for Boost.Graph library"
DESCRIPTION = "Development headers for Boost.Graph library. The BGL algorithms consist \
of a core set of algorithm patterns and a larger set of graph \
algorithms. The core algorithm patterns are Breadth First Search, Depth \
First Search, and Uniform Cost Search."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_graph1_82_0-devel-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "fe0e0cdcf214ce4175a4a9c33f17503e3dbda4d90a280ba0d6b3e3a6dda5b835d694b7cd543216369363a4573fe967456e8c35a88a2235885f0260f5afd971c1"

RPROVIDES:${PN} += "libboost-graph-devel-impl \
libboost-graph1-82-0-devel"

RDEPENDS:${PN} += "libboost-graph1-82-0 \
libboost-headers1-82-0-devel \
libboost-regex1-82-0-devel \
libstdc++-devel"

inherit rpm
