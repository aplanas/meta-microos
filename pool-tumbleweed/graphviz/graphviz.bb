SUMMARY = "Graph Visualization Tools"
DESCRIPTION = "A collection of tools and tcl packages for the manipulation and layout \
of graphs (as in nodes and edges, not as in bar charts)."
LICENSE = "EPL-1.0"

PV = "2.49.3"

RPM_NAME = "graphviz-2.49.3-6.4.aarch64.rpm"
RPM_HASH = "f81a1ba85cad3b7c90a615b2d73b1d874da4fab1358e9c5962a4eb454c71d802ef2ff0c3fb0186e497dc1f9b28be65807cb1a5eb53656f50325a06ea89fbbf83"

RPROVIDES:${PN} += "graphviz"

RDEPENDS:${PN} += "/usr/bin/sh \
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
