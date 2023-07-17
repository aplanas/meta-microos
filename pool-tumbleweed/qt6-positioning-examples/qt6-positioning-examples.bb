SUMMARY = "Examples for the qt6-positioning module"
DESCRIPTION = "Examples for the qt6-positioning module."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-positioning-examples-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "efc157eb24ec098a268cac61c71c838e107cba805a78aaba57a04166007f9de24ae8b7cd0ecfd7c7f093b7cdb73ecc6beb5c835b936c712ce2da6012790395c9"

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
