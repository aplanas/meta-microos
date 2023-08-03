SUMMARY = "Qt 6 PositioningQuick library"
DESCRIPTION = "The Qt 6 PositioningQuick library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "libQt6PositioningQuick6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "19a63c121ae63e0c34ebaff05374b127f6f0975ff903eb2b053abc85f224060c82789353977bf1768a34610d4844a843b6cc2fd1fdbb10d7a90563f39e684148"

RPROVIDES:${PN} += "libQt6PositioningQuick.so.6 \
libQt6PositioningQuick6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Positioning.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
