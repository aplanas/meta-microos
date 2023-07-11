SUMMARY = "Qt 5 3D Addon"
DESCRIPTION = "Qt is a set of libraries for developing applications. \
 \
This Qt 3D module contains functionality to support near-realtime \
simulation systems."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde0"

RPM_NAME = "libQt53DQuickExtras5-5.15.10+kde0-1.1.aarch64.rpm"
RPM_HASH = "70c410839c10c3d6d37c487732afd85b3d46a586b609f53ded62e5c32c67207d9ccd2894188245b8edbec88f34d7d6fb973c3cb772c1c4f54368d323b7fe1d65"

RPROVIDES:${PN} += "libQt53DQuickExtras.so.5 \
libQt53DQuickExtras5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt53DCore.so.5 \
libQt53DExtras.so.5 \
libQt53DInput.so.5 \
libQt53DLogic.so.5 \
libQt53DQuick.so.5 \
libQt53DRender.so.5 \
libQt5Core.so.5 \
libQt5Core5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
