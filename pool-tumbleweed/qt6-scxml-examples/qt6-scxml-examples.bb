SUMMARY = "Examples for the qt6-scxml modules"
DESCRIPTION = "Examples for the qt6-scxml modules."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-scxml-examples-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "a58757c2126b2b643863d64e8fedf3519d21f78f70c1b6c7eba2e85a43a9cdfbb307c6f354919af678495ee87a6bab82e9979eacfa08e6102547b69933e2d059"

RPROVIDES:${PN} += "qt6-scxml-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libQt6Scxml.so.6 \
libQt6StateMachine.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
