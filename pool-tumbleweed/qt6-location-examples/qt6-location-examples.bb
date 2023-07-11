SUMMARY = "Examples for the qt6-location modules"
DESCRIPTION = "Examples for the qt6-location modules."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-location-examples-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "d9b62394ae85f544f006993be89169299ad79f65b58c5f5ea6416363330ef53a86edffad183b69aa5e5602d6685483d4379f1356290d69304f2be13e634586fe"

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
