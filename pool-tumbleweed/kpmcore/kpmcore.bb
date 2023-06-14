SUMMARY = "KDE Partition Manager core library"
DESCRIPTION = "Library for managing partitions. Common code for KDE Partition Manager and \
other projects."
LICENSE = "GPL-3.0-only"

PV = "23.04.1"

RPM_NAME = "kpmcore-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "a9e38672944519ee13adfca4ebe0495f20d33bf6d41c3cf83b9b7fcde5b74220b40abd87f195914a7c2be0af3de3983b1f28bb7abc96d6c30731995b59feca80"

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
