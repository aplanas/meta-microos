SUMMARY = "Examples for the qt6-scxml modules"
DESCRIPTION = "Examples for the qt6-scxml modules."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-scxml-examples-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "7f83c2e501122af586e2b127e60ec4727021d44163ee4e0a6ae5d47cbb2bef0d565d06ada50bdd6ce897ec4793626b19c0170c9d0b9f0bdff8feec22980c9bf2"

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
