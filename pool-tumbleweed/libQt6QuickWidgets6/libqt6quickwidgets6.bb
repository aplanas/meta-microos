SUMMARY = "Qt 6 QuickWidgets library"
DESCRIPTION = "The Qt 6 QuickWidgets library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6QuickWidgets6-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "e3c37336601b3fc8221ea370c8803f9c0f12a2a4cd692170964b2164adf7285a69921fb39fbb2a258dc03f6c6e3f284fa6c1b3685a4ada241268c8f436063ce9"

RPROVIDES:${PN} += "libQt6QuickWidgets.so.6 \
libQt6QuickWidgets6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
