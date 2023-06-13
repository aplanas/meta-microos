SUMMARY = "Interface for media player KParts"
DESCRIPTION = "KMediaPlayer builds on the KParts framework to provide a common interface for \
KParts that can play media files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "libKF5MediaPlayer5-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "932b39f388692be3a020fe8a968c76b148b9269fda744105da6f0c14c91981b033645abfcbccce2575418d5e665a000931652decd34848909eef0c69a35d3dee"

RPROVIDES:${PN} += "libKF5MediaPlayer.so.5()(64bit) \
libKF5MediaPlayer5 \
libKF5MediaPlayer5(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libKF5Parts.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
