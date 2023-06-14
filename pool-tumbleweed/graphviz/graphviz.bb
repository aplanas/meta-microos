SUMMARY = "Graph Visualization Tools"
DESCRIPTION = "A collection of tools and tcl packages for the manipulation and layout \
of graphs (as in nodes and edges, not as in bar charts)."
LICENSE = "EPL-1.0"

PV = "2.49.3"

RPM_NAME = "graphviz-2.49.3-6.3.aarch64.rpm"
RPM_HASH = "31e70df36285d6e8c8b8af41cbf11dcfaa4f4216a02fba2b535213acc60d7bccdb1c525fa2786d1ac66f1b2ca47d3f74e761fd284c137d3730ff0fb1ad40ab22"

RPROVIDES:${PN} += "graphviz"

RDEPENDS:${PN} += "/bin/sh \
graphviz-plugins-core \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcdt.so.5 \
libcgraph.so.6 \
libexpat.so.1 \
libglib-2.0.so.0 \
libgts-0.7.so.5 \
libgvc.so.6 \
libgvplugin-core.so.6 \
libgvplugin-dot-layout.so.6 \
libgvplugin-neato-layout.so.6 \
libgvpr.so.2 \
liblab-gamut.so.1 \
libm.so.6"

inherit rpm
