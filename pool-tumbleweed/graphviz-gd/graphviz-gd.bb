SUMMARY = "Graphviz plugin for renderers based on gd"
DESCRIPTION = "The graphviz-gd package contains the gd extensions for the graphviz \
tools."
LICENSE = "EPL-1.0"

PV = "2.49.3"

RPM_NAME = "graphviz-gd-2.49.3-6.9.aarch64.rpm"
RPM_HASH = "b874e207a171eb5a8f9fd37041430d492397ad100474dd1f6c55550e735833beb9e291e102d9511e41cdf27edd0f7039cb8b53fdb0d7840a11b2f3015210da7b"

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
