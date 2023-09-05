SUMMARY = "CDDB library for KDE Applications"
DESCRIPTION = "The KDE Compact Disc DataBase library provides an API for \
applications to fetch and submit audio CD \
information over the Internet."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "libKF5Cddb5-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "5491758671a6cb5a9b8b8b7728b04c20429c84a1f941928fa9356899ad369480d84f4ad6516fd59b234ece4d9dfd94d084eb3f7ba80354749647999650e7887c"

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
