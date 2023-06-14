SUMMARY = "Library for extracting Metadata"
DESCRIPTION = "A library for extracting file metadata."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "5.106.0"

RPM_NAME = "kfilemetadata5-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "36b724393b05b0799cc9dd54f8b5ed82695f56e28574d6ed8a7cd2e6227a65ae370534f7b597529a6223247d5e64856acc09a17a40b5c36af64974b818ccb73d"

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
libexiv2.so.27 \
libgcc-s.so.1 \
libm.so.6 \
libpoppler-qt5.so.1 \
libqmobipocket.so.2 \
libstdc++.so.6 \
libtag.so.1"

inherit rpm
