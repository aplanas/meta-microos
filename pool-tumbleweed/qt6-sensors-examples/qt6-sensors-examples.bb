SUMMARY = "Examples for the qt6-sensors modules"
DESCRIPTION = "Examples for the qt6-sensors modules."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-sensors-examples-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "d588bd9a275f10691663a8d6c4f6039269ff440a3255d2cfb2405b363b38e473e7fc1b41b62ef879a9f04bef9af62e08778d9adddad78e54cfe49a969e950d34"

RPROVIDES:${PN} += "qt6-sensors-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
