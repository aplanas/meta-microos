SUMMARY = "Qt 6 QuickDialogs2Utils library"
DESCRIPTION = "The Qt 6 QuickDialogs2Utils library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6QuickDialogs2Utils6-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "5c98d9b4d26481e880c97283e442bce95073433b1fc217ac319ab29f16961e68c8f4c748a4c2851b99559e63c13bf98e1045a5d4214e2cbfacf5012a413096c4"

RPROVIDES:${PN} += "libQt6QuickDialogs2Utils.so.6 \
libQt6QuickDialogs2Utils6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
