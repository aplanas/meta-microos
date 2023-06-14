SUMMARY = "KDE Partition Manager core library"
DESCRIPTION = "Library for managing partitions. Common code for KDE Partition Manager and \
other projects. \
 \
Main kpmcore library."
LICENSE = "GPL-3.0-only"

PV = "23.04.1"

RPM_NAME = "libkpmcore12-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "f528d2ff0a8f6b1abd941666a3ac78c9099e8201afcf833ed739d042b88953dd1ac70ba8fbbc76e89e54ee983f7e377933bc62c06444e5d3069c4edd6bd3a508"

RPROVIDES:${PN} += "libkpmcore.so.12 \
libkpmcore12"

RDEPENDS:${PN} += "/sbin/ldconfig \
kpmcore \
ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5WidgetsAddons.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libblkid.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
