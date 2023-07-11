SUMMARY = "Core plugins for graphviz"
DESCRIPTION = "Core plugins for graphviz: \
 * libgvplugin_core \
 * libgvplugin_dot_layout \
 * libgvplugin_neato_layout"
LICENSE = "EPL-1.0"

PV = "2.49.3"

RPM_NAME = "graphviz-plugins-core-2.49.3-6.4.aarch64.rpm"
RPM_HASH = "c86c3b644d5458f5e3e6213623b017ecd760c50064373c13a0ae93abb9cb857436fc161da9f44a0ae9d1b7b72b712be87fe47d975691220051540c879890cdee"

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
