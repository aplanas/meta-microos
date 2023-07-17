SUMMARY = "Examples for the qt6-location modules"
DESCRIPTION = "Examples for the qt6-location modules."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-location-examples-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "2a3667a8c9e8002393ee47f52854b36c3a388d430536c7c1ac865cbba6125285e34edc763f51b5cfd572aeacdaaa820bf98304909058b9037bb08f87525d7dbf"

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
