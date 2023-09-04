SUMMARY = "Qt 6 QuickShapes library"
DESCRIPTION = "The Qt 6 QuickShapes library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "libQt6QuickShapes6-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "6cbbb369fd33c09702c6abb862046a656247eeec6c2ef481a3e42cec997543e149117019880793479aa41856be40edcd2f3a9aa0b184f483f5680026251819fc"

RPROVIDES:${PN} += "libQt6QuickShapes.so.6 \
libQt6QuickShapes6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
