SUMMARY = "Easily manage disks, partitions and file systems on your KDE Desktop"
DESCRIPTION = "This software allows you to manage your disks, partitions and \
file systems: Create, resize, delete, copy, backup and restore \
partitions with a large number of supported file systems (ext2/3, \
reiserfs, NTFS, FAT32 and more). It makes use of external \
programs to get its job done, so you might have to install \
additional software (preferably packages from your distribution) \
to make use of all features and get full support for all file \
systems."
LICENSE = "GPL-3.0-or-later"

PV = "23.04.3"

RPM_NAME = "partitionmanager-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "5cdca3ef620767ec1b94ad34b1da3c5ce6ab056efc7528811ccba4c3d013b783c3fe77172a424e9157819c2dd4188741c48dc5cef040fec608f9a469001588de"

RPROVIDES:${PN} += "partitionmanager \
partitionmanager5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5JobWidgets.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOGui.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5WindowSystem.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libkpmcore.so.12 \
libpolkit-qt5-core-1.so.1 \
libstdc++.so.6"

inherit rpm
