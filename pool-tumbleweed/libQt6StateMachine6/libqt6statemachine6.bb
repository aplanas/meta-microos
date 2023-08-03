SUMMARY = "Qt 6 StateMachine library"
DESCRIPTION = "The Qt 6 StateMachine library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "libQt6StateMachine6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "b8644d4be48a90e4f23cd2db9a1b4e689923cced6e23a980442e0ba000e9f48ec7dbaa2c7ed56871da2991b485bca7f7a765406176d99110ff1768a7454ef4be"

RPROVIDES:${PN} += "libQt6StateMachine.so.6 \
libQt6StateMachine6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
