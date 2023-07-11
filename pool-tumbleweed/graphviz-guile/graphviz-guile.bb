SUMMARY = "Graph Visualization Tools"
DESCRIPTION = "A collection of tools and tcl packages for the manipulation and layout \
of graphs (as in nodes and edges, not as in bar charts)."
LICENSE = "EPL-1.0"

PV = "2.49.3"

RPM_NAME = "graphviz-guile-2.49.3-6.8.aarch64.rpm"
RPM_HASH = "ddf5e81181491b2edaf28b9483f13b938c2ac4efcdea75e6a998d33f84fe5e9c32c67dca4a7d5357b9d6c725f4d20773e722cc33cc8fd9602865d4f19b7c5c7a"

RPROVIDES:${PN} += "graphviz-guile \
libgv-guile.so"

RDEPENDS:${PN} += "graphviz \
guile \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcgraph.so.6 \
libgcc-s.so.1 \
libguile-3.0.so.1 \
libgvc.so.6 \
libstdc++.so.6"

inherit rpm
