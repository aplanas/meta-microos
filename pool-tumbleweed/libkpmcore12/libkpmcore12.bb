SUMMARY = "KDE Partition Manager core library"
DESCRIPTION = "Library for managing partitions. Common code for KDE Partition Manager and \
other projects. \
 \
Main kpmcore library."
LICENSE = "GPL-3.0-only"

PV = "23.04.3"

RPM_NAME = "libkpmcore12-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "fee4252e160ce5ccbd89f4ec0559131b0c84fc368245c5eaebbef76df14ecd43700d20483330fd1b9a4ff61b44c348ba0570b866b8662187b10cd9cde52443b2"

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
