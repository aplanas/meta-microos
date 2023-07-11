SUMMARY = "CDDB library for KDE Applications"
DESCRIPTION = "The KDE Compact Disc DataBase library provides an API for \
applications to fetch and submit audio CD \
information over the Internet."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "libKF5Cddb5-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "ed19a225037a79af7c281867eab4ce19a763e61e1b42339fd62e8256c3eee91885d4d0f4822d23dd113e84a701920b6bf42e376b8505fcbb13a620dc83aab9fd"

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
