SUMMARY = "PipeWire Graph Qt GUI Interface"
DESCRIPTION = "qpwgraph is a graph manager dedicated for PipeWire, using the \
Qt C++ framework, based and pretty much like the same of QjackCtl."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.1"

RPM_NAME = "qpwgraph-0.5.1-1.1.aarch64.rpm"
RPM_HASH = "86f5ac5bb92be471402c1c679dd3e7e297909705f266454cc8aa5716d9216efa2644a651dd6df2bd090afd2d175d02f01c2cf73cb457d2ccdfc6946a7c1f6e8d"

RPROVIDES:${PN} += "qpwgraph"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libasound.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpipewire-0.3.so.0 \
libstdc++.so.6"

inherit rpm
