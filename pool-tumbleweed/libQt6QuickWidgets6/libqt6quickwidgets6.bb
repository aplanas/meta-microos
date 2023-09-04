SUMMARY = "Qt 6 QuickWidgets library"
DESCRIPTION = "The Qt 6 QuickWidgets library."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "libQt6QuickWidgets6-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "1d57ee3621828c4061e41d7ef45b7ee73d0b2091888a81ba66653d7c89f9cf4de077fd129a33bdfd45a680a8d77646e37970978604ce511f41915a95a1f958a7"

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
