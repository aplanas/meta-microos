SUMMARY = "Graphical user interface to svgcleaner"
DESCRIPTION = "This package provides a Qt graphical user interface to svgcleaner."
LICENSE = "GPL-2.0-only"

PV = "0.9.5"

RPM_NAME = "svgcleaner-gui-0.9.5-2.26.aarch64.rpm"
RPM_HASH = "6dc34a0de018ebda93abdcb236fef3227f32af851ca33e5e4326040fa0e4aead31ef4d109e3b5dd35c58d2ce635a348932f2f60ff10ae743fd97c38ceaba5f85"

RPROVIDES:${PN} += "svgcleaner-gui"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Concurrent.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
p7zip \
svgcleaner"

inherit rpm
