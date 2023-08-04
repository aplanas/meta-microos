SUMMARY = "Integration plugins for various KDE frameworks for wayland windowing system"
DESCRIPTION = "Provides integration plugins for various KDE frameworks for the wayland windowing system."
LICENSE = "LGPL-2.1-or-later"

PV = "5.27.7"

RPM_NAME = "kwayland-integration-5.27.7-1.1.aarch64.rpm"
RPM_HASH = "de501153f407cd56b7c0f3c562a1353f59266222075240ef340bf7b9f82ba2d615be32079699f39907286cc5abd154b43a9adc6674ebccffa9de87e8dd339df7"

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
