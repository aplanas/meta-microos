SUMMARY = "PipeWire Graph Qt GUI Interface"
DESCRIPTION = "qpwgraph is a graph manager dedicated for PipeWire, using the \
Qt C++ framework, based and pretty much like the same of QjackCtl."
LICENSE = "GPL-2.0-or-later"

PV = "0.4.5"

RPM_NAME = "qpwgraph-0.4.5-1.1.aarch64.rpm"
RPM_HASH = "84ac19fb9f044907919c87e579011559860832c4eeafffd4638c52c91544fe9db4fa01b24b56d2d87d03bd45df595e391f0e6cb5944d2a96e4c586fb59ef976e"

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
