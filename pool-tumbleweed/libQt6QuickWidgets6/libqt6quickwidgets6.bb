SUMMARY = "Qt 6 QuickWidgets library"
DESCRIPTION = "The Qt 6 QuickWidgets library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "libQt6QuickWidgets6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "51861137319c61f593b3bc63247f69dc6eb9be9e053654aa71548cc0e1f32e9f5a615ed11c9e15f018e9bee7250eb7c17083850c5ea59b64c62e1c8ef9b2598b"

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
