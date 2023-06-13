SUMMARY = "Graph Visualization Tools"
DESCRIPTION = "A collection of tools and tcl packages for the manipulation and layout \
of graphs (as in nodes and edges, not as in bar charts)."
LICENSE = "EPL-1.0"

PV = "2.49.3"

RPM_NAME = "graphviz-2.49.3-6.3.aarch64.rpm"
RPM_HASH = "31e70df36285d6e8c8b8af41cbf11dcfaa4f4216a02fba2b535213acc60d7bccdb1c525fa2786d1ac66f1b2ca47d3f74e761fd284c137d3730ff0fb1ad40ab22"

RPROVIDES:${PN} += "graphviz \
graphviz(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
graphviz-plugins-core \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcdt.so.5()(64bit) \
libcgraph.so.6()(64bit) \
libexpat.so.1()(64bit) \
libglib-2.0.so.0()(64bit) \
libgts-0.7.so.5()(64bit) \
libgvc.so.6()(64bit) \
libgvplugin_core.so.6()(64bit) \
libgvplugin_dot_layout.so.6()(64bit) \
libgvplugin_neato_layout.so.6()(64bit) \
libgvpr.so.2()(64bit) \
liblab_gamut.so.1()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
