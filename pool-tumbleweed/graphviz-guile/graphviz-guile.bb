SUMMARY = "Graph Visualization Tools"
DESCRIPTION = "A collection of tools and tcl packages for the manipulation and layout \
of graphs (as in nodes and edges, not as in bar charts)."
LICENSE = "EPL-1.0"

PV = "2.49.3"

RPM_NAME = "graphviz-guile-2.49.3-6.9.aarch64.rpm"
RPM_HASH = "382e80e9dee9b707643e1739fb5bf6427859db4c000d53267917328a9a0c976caf1a5c04c92016f9d37aade670c70ec10b3b3cbec90ee957a82633c442dd9896"

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
