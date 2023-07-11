SUMMARY = "Examples for the qt6-sensors modules"
DESCRIPTION = "Examples for the qt6-sensors modules."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-sensors-examples-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "7350569da5c287bb708a8a55afa87878fe2f76b268e1b683343019fb5cf033ef33d1e74092b9c5a52686615f2c1e75949d62ff44866353c99c3ff29bfdeabfab"

RPROVIDES:${PN} += "qt6-sensors-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
