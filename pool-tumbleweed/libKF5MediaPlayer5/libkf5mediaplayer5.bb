SUMMARY = "Interface for media player KParts"
DESCRIPTION = "KMediaPlayer builds on the KParts framework to provide a common interface for \
KParts that can play media files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "libKF5MediaPlayer5-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "f081bd7fee7c3d35d6eae3dd5cfd38f987b39333db6368d61beaba312d8b318a83566ee8868ce859e35bc95a391276c111dbaeada5772bb2893921c6f11c769b"

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
