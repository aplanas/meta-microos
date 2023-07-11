SUMMARY = "Graph editor based on Qt"
DESCRIPTION = "The Qt5 graph editor included with graphviz."
LICENSE = "EPL-1.0"

PV = "2.49.3"

RPM_NAME = "graphviz-gvedit-2.49.3-6.4.aarch64.rpm"
RPM_HASH = "36755e5780f76408c41cbc08059e8e627ca073de6569c11a32df406cd5e007e5d219403bb19fb4bae46ba6b0cb6ac6c57bcfc57e30c7863351b643a02eb6fc19"

RPROVIDES:${PN} += "graphviz-gvedit"

RDEPENDS:${PN} += "graphviz \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libcgraph.so.6 \
libgcc-s.so.1 \
libgvc.so.6 \
libstdc++.so.6"

inherit rpm
