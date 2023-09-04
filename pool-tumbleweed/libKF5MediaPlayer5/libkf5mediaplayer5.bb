SUMMARY = "Interface for media player KParts"
DESCRIPTION = "KMediaPlayer builds on the KParts framework to provide a common interface for \
KParts that can play media files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "libKF5MediaPlayer5-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "70e08cfd76b350ac9e7f6d7426cd3310b28a85d6d1b8dc4e359ffae0628f84d29c02c424f8aa71c33854ff4f565d199d8646eaaeb512e8001b1b1456355e3fef"

RPROVIDES:${PN} += "libKF5MediaPlayer.so.5 \
libKF5MediaPlayer5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Parts.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
