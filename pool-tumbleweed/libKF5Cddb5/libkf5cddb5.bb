SUMMARY = "CDDB library for KDE Applications"
DESCRIPTION = "The KDE Compact Disc DataBase library provides an API for \
applications to fetch and submit audio CD \
information over the Internet."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "libKF5Cddb5-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "90a5f45a0ade1b1416665c24bf0fae529cb07344381eae01a875e4417116132f6b7ac3771320324900f9654532ac8f0a250f6290e3ffcf844907c5e2c3bebeb7"

RPROVIDES:${PN} += "libKF5Cddb.so.5()(64bit) \
libKF5Cddb5 \
libKF5Cddb5(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libmusicbrainz5.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
