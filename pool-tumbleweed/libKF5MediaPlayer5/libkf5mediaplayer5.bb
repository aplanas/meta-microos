SUMMARY = "Interface for media player KParts"
DESCRIPTION = "KMediaPlayer builds on the KParts framework to provide a common interface for \
KParts that can play media files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "libKF5MediaPlayer5-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "9218f9b0d1c67a49140452c437f1c2af82c94ad7c3d262c6e4b10d90e780587f1583d2a0af143e32106c38fa710ea5362aacfda1c8d74a4ae3862d9e85fc0cac"

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
