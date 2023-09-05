SUMMARY = "CD drive library for KDE Platform"
DESCRIPTION = "The KDE Compact Disc library provides an API for applications using \
the KDE Platform to interface with the CD drives for audio CDs."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "libKF5CompactDisc5-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "e987087ac8438e00efe42bfd2e3c35c6da3ed8ab04af355a9dd2f13bcc16654879544b36c329f59e2abf4f694f4f6d7f5e76890fa249bbf1cceca76ccb6f1c70"

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
