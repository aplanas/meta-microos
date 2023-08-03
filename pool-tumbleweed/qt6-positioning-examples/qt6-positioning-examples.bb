SUMMARY = "Examples for the qt6-positioning module"
DESCRIPTION = "Examples for the qt6-positioning module."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-positioning-examples-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "1e93ed13b6c0def06dfa6607532f986612b89f2f9ebfadf929bdeecc4ca2f5e9d362fadc28638062754667a50310b07579bd11889f716cd4a96da14aff3ab573"

RPROVIDES:${PN} += "qt6-location-examples \
qt6-positioning-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Positioning.so.6 \
libQt6Qml.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
