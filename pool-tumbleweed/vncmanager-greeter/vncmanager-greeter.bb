SUMMARY = "Greeter for VNC session manager"
DESCRIPTION = "This is graphical greeter that appears when VNC client connects to VNC manager."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "vncmanager-greeter-1.0.0-1.32.aarch64.rpm"
RPM_HASH = "ebbab1838f426f5f51954f96253cdf992dc6e25cadaf5a47a262702bb6df0145e32547788b61a044de9775c2586299ab72204b47ae0d3a9d2fd7928114e06d66"

RPROVIDES:${PN} += "vncmanager-greeter"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
