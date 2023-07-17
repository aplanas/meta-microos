SUMMARY = "Qt 6 QuickWidgets library"
DESCRIPTION = "The Qt 6 QuickWidgets library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6QuickWidgets6-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "08770fc3290db41bba173df5b6063a48522f637851579973dfdd23970a6a6bb385637ae4630bc6688243beabcf38af2cb5198e35ac0a8e915dc98ad9bcd9afce"

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
