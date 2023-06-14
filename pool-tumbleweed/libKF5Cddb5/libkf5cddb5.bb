SUMMARY = "CDDB library for KDE Applications"
DESCRIPTION = "The KDE Compact Disc DataBase library provides an API for \
applications to fetch and submit audio CD \
information over the Internet."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "libKF5Cddb5-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "90a5f45a0ade1b1416665c24bf0fae529cb07344381eae01a875e4417116132f6b7ac3771320324900f9654532ac8f0a250f6290e3ffcf844907c5e2c3bebeb7"

RPROVIDES:${PN} += "libKF5Cddb.so.5 \
libKF5Cddb5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5KIOCore.so.5 \
libQt5Core.so.5 \
libQt5Network.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libmusicbrainz5.so.1 \
libstdc++.so.6"

inherit rpm
