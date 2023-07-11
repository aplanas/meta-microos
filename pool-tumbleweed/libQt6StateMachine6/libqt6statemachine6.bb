SUMMARY = "Qt 6 StateMachine library"
DESCRIPTION = "The Qt 6 StateMachine library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6StateMachine6-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "d215a28723c654adee5380248ea1459ecb8b12018a049ca448bc7fde7415f2595d3362692c1cb121d6ee48f42fffe6d8afe7441e3a891e0a06966e8902b9166c"

RPROVIDES:${PN} += "libQt6StateMachine.so.6 \
libQt6StateMachine6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
