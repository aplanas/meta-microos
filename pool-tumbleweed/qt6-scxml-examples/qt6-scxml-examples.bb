SUMMARY = "Examples for the qt6-scxml modules"
DESCRIPTION = "Examples for the qt6-scxml modules."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-scxml-examples-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "3b801a817d60cf10483ae518738dd5e4b8c50187454b4676c4d4b36dc118875018c534296ba5b40b0fdfb8fef0c9f9fe19c3d525f89aeed2c5fd2be51c31c1a7"

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
