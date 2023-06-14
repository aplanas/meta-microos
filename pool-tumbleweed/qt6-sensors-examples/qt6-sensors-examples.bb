SUMMARY = "Examples for the qt6-sensors modules"
DESCRIPTION = "Examples for the qt6-sensors modules."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-sensors-examples-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "aad60867bfe0e0b671ffff0b3f181414efde578bcb66cd96258cfd001ef94eea4f57ec27e120c5ac9fe8d7f265b45ee9f7d46469ef134c54af0fad2d831f3998"

RPROVIDES:${PN} += "qt6-sensors-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
