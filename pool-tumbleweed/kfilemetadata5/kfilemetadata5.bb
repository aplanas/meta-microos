SUMMARY = "Library for extracting Metadata"
DESCRIPTION = "A library for extracting file metadata."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "5.109.0"

RPM_NAME = "kfilemetadata5-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "77ea09d07e9e58dcf22d24e15d34c9e349060f75de112cd671e2c4d090d8abe2c43657c048c43c4b7587200d728e53c598b865516c8b7f25a85a39a686b5535b"

RPROVIDES:${PN} += "kfilemetadata5 \
libKF5FileMetaData.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Archive.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Xml.so.5 \
libavformat.so.60 \
libavutil.so.58 \
libc.so.6 \
libepub.so.0 \
libexiv2.so.28 \
libgcc-s.so.1 \
libm.so.6 \
libpoppler-qt5.so.1 \
libqmobipocket.so.2 \
libstdc++.so.6 \
libtag.so.1"

inherit rpm
