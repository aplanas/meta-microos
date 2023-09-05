SUMMARY = "KDE Partition Manager core library"
DESCRIPTION = "Library for managing partitions. Common code for KDE Partition Manager and \
other projects."
LICENSE = "GPL-3.0-only"

PV = "23.08.0"

RPM_NAME = "kpmcore-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "7595c9f8cda6aa549d017f6cb423b4c488b284d23c88c87508c9f790fb494c267d9bec191457a856f11c1f9a2472c49c910c26e8aa4f4916b3d62de72460c03d"

RPROVIDES:${PN} += "kpmcore"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libkpmcore.so.12 \
libpolkit-qt5-core-1.so.1 \
libstdc++.so.6"

inherit rpm
