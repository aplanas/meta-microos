SUMMARY = "CD drive library for KDE Platform"
DESCRIPTION = "The KDE Compact Disc library provides an API for applications using \
the KDE Platform to interface with the CD drives for audio CDs."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "libKF5CompactDisc5-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "41462623cd841a6d87e48a67772d687278e57b6211bef3f7f62a7086c9dd1225f60ba28b59f165c8db08fc92016862770642d64df69a4381bd574216d75b64a6"

RPROVIDES:${PN} += "libKF5CompactDisc.so.5 \
libKF5CompactDisc5 \
libkcompactdisc"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5I18n.so.5 \
libKF5Solid.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libasound.so.2 \
libc.so.6 \
libphonon4qt5.so.4 \
libstdc++.so.6"

inherit rpm
