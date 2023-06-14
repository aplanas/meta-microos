SUMMARY = "Libyui - Qt graph widget"
DESCRIPTION = "This package contains the Qt graph component for libyui. \
 \
This is a special widget to visualize graphs such as the \
storage device hierarchy (disks, partitions, subvolumes \
etc.).  and similar graphviz-generated graphs."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "4.6.0"

RPM_NAME = "libyui-qt-graph16-4.6.0-1.1.aarch64.rpm"
RPM_HASH = "b656eaa8d3530ecbcb1684c78eac435e6c3fecb3109e74951130875cf5ee14c57b07bc0d72d31d4e3998d3c9aa395beb034a4257fa6ad5a2393d4ee19008ebd0"

RPROVIDES:${PN} += "libyui-qt-graph \
libyui-qt-graph.so.16 \
libyui-qt-graph16 \
yast2-qt-graph"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libcgraph.so.6 \
libgcc-s.so.1 \
libgvc.so.6 \
libm.so.6 \
libstdc++.so.6 \
libyui-qt16 \
libyui.so.16 \
libyui16"

inherit rpm
