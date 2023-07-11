SUMMARY = "PipeWire Graph Qt GUI Interface"
DESCRIPTION = "qpwgraph is a graph manager dedicated for PipeWire, using the \
Qt C++ framework, based and pretty much like the same of QjackCtl."
LICENSE = "GPL-2.0-or-later"

PV = "0.4.2"

RPM_NAME = "qpwgraph-0.4.2-1.2.aarch64.rpm"
RPM_HASH = "d1b4e008dd43a1a858d06cb383dfce0e94c5b7cbd830bc7e66efb08522717479e57bd229912ed5d709f96cb71da0b062c1203842461793c202d68721d8358d41"

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
