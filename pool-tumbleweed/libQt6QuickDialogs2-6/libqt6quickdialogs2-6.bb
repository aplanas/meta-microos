SUMMARY = "Qt 6 QuickDialogs2 library"
DESCRIPTION = "The Qt 6 QuickDialogs2 library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "libQt6QuickDialogs2-6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "ed923a29fd614627dd3fbb8b09891d3e7aef04d94e609dd8ea03a72212e5c6a97ce948111b8a490634178eb80b45afb8d6e5db65dedb21793a97cc14eef3ed2a"

RPROVIDES:${PN} += "libQt6QuickDialogs2-6 \
libQt6QuickDialogs2.so.6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6QuickDialogs2QuickImpl.so.6 \
libQt6QuickDialogs2Utils.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
