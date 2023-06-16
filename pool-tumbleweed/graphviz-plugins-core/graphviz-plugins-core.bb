SUMMARY = "Core plugins for graphviz"
DESCRIPTION = "Core plugins for graphviz: \
 * libgvplugin_core \
 * libgvplugin_dot_layout \
 * libgvplugin_neato_layout"
LICENSE = "EPL-1.0"

PV = "2.49.3"

RPM_NAME = "graphviz-plugins-core-2.49.3-6.3.aarch64.rpm"
RPM_HASH = "eed9b991466b38ca4b54d8842a25574bc7f1f8447e03eac65de8858b3f6829a79b8a0f51c87b1b2e87a5118a1a7178a9893d818ee7a4238a6a5f6902d38d3e4b"

RPROVIDES:${PN} += "graphviz-plugins-core \
libgvplugin-core.so.6 \
libgvplugin-dot-layout.so.6 \
libgvplugin-neato-layout.so.6"

RDEPENDS:${PN} += "/usr/bin/sh \
graphviz \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcdt.so.5 \
libcgraph.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgts-0.7.so.5 \
libgvc.so.6 \
libm.so.6 \
libpathplan.so.4 \
libstdc++.so.6"

inherit rpm
