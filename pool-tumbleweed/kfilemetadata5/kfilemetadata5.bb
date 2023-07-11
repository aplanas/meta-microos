SUMMARY = "Library for extracting Metadata"
DESCRIPTION = "A library for extracting file metadata."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "5.107.0"

RPM_NAME = "kfilemetadata5-5.107.0-1.2.aarch64.rpm"
RPM_HASH = "57d3bd68d2372f32628dd7668a13f3a08324f6256e1fc2ff7680470dc57ba98bb436c0e89b70cdb2c2f96021e6423440f18893b043e473840d3e267ad823d37c"

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
