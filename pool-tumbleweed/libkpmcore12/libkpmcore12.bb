SUMMARY = "KDE Partition Manager core library"
DESCRIPTION = "Library for managing partitions. Common code for KDE Partition Manager and \
other projects. \
 \
Main kpmcore library."
LICENSE = "GPL-3.0-only"

PV = "23.08.0"

RPM_NAME = "libkpmcore12-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "225ecf03cf4f56ee2cb1267a9f818a5db637d40f806d1e3f52b422e7349716b6916475dc1216c00ef3fe50a922d98eecd7bf9c2ac12c0af3157fe4c9e5819e43"

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
