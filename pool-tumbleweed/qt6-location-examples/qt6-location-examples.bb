SUMMARY = "Examples for the qt6-location modules"
DESCRIPTION = "Examples for the qt6-location modules."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-location-examples-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "72a3adca11fc8821a1bed0402e7f92b264de5be042f58c7468b6f39c51d1cdca43a08061cbeff6e0ba141816effef8224125e54cda0c50acfddd1742c3538d9f"

RPROVIDES:${PN} += "qt6-location-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Positioning.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
