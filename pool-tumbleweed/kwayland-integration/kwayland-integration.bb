SUMMARY = "Integration plugins for various KDE frameworks for wayland windowing system"
DESCRIPTION = "Provides integration plugins for various KDE frameworks for the wayland windowing system."
LICENSE = "LGPL-2.1-or-later"

PV = "5.27.6"

RPM_NAME = "kwayland-integration-5.27.6-1.1.aarch64.rpm"
RPM_HASH = "d165dab349e1ecc574047af135379397e63028e7f47f0cf6c2ea1a1ae0020eeba9ec9688660ee804f1cac8a064cc3e752fcdfbcbf6636616e81ed5cb6a2f8b39"

RPROVIDES:${PN} += "kwayland-integration"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5WaylandClient.so.5 \
libKF5WindowSystem.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5WaylandClient.so.5 \
libc.so.6 \
libstdc++.so.6 \
libwayland-client.so.0"

inherit rpm
