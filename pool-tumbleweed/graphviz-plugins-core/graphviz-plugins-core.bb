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
graphviz-plugins-core(aarch-64) \
libgvplugin_core.so.6()(64bit) \
libgvplugin_dot_layout.so.6()(64bit) \
libgvplugin_neato_layout.so.6()(64bit)"

RDEPENDS:${PN} += "/bin/sh \
graphviz \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcdt.so.5()(64bit) \
libcgraph.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libglib-2.0.so.0()(64bit) \
libgts-0.7.so.5()(64bit) \
libgvc.so.6()(64bit) \
libm.so.6()(64bit) \
libpathplan.so.4()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
