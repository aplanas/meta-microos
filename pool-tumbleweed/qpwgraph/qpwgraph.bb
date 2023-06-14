SUMMARY = "PipeWire Graph Qt GUI Interface"
DESCRIPTION = "qpwgraph is a graph manager dedicated for PipeWire, using the \
Qt C++ framework, based and pretty much like the same of QjackCtl."
LICENSE = "GPL-2.0-or-later"

PV = "0.4.2"

RPM_NAME = "qpwgraph-0.4.2-1.1.aarch64.rpm"
RPM_HASH = "5f436317684dcb2c1060f0c6bb5e1ecbcd3a6b89d52faa38a3a4d9f4b3e19ecf8b7bdb9ad2b77feab7041cd5abb14b7d7644160ba8cf47edec33ee8bbee334fa"

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
