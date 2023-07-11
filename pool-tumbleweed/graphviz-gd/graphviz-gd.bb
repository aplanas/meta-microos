SUMMARY = "Graphviz plugin for renderers based on gd"
DESCRIPTION = "The graphviz-gd package contains the gd extensions for the graphviz \
tools."
LICENSE = "EPL-1.0"

PV = "2.49.3"

RPM_NAME = "graphviz-gd-2.49.3-6.8.aarch64.rpm"
RPM_HASH = "1469280f4247cb01a2fcafb89b5f49d8951900c7aec340dfbf9beb12db418e3b970495558e0d1cebab2c5c788201d1780fb4f5612437c6764a5f833d0385e1d5"

RPROVIDES:${PN} += "graphviz-gd \
libgvplugin-gd.so.6"

RDEPENDS:${PN} += "/usr/bin/sh \
graphviz \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libcgraph.so.6 \
libgd.so.3 \
libgvc.so.6 \
libm.so.6 \
libpathplan.so.4"

inherit rpm
