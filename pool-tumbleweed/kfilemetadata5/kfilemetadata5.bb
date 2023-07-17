SUMMARY = "Library for extracting Metadata"
DESCRIPTION = "A library for extracting file metadata."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "5.108.0"

RPM_NAME = "kfilemetadata5-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "de06f875bcf0c7eea759ba9e0eb6491cfd6f833019aea375aad081cc18938103689bee28094fde8f6e9e2fe040d39392334da8af7ea97ebf29abe75596747916"

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
