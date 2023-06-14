SUMMARY = "CD drive library for KDE Platform"
DESCRIPTION = "The KDE Compact Disc library provides an API for applications using \
the KDE Platform to interface with the CD drives for audio CDs."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "libKF5CompactDisc5-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "3eff69753f62b481f620e27c36105164272dd65ae141b4d301d15b03c25151308a66f056125cc552cebf68b10cc2bf582cdc0fc59509af8786e0b790dff6cf61"

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
