SUMMARY = "Libraries for appstream compose support"
DESCRIPTION = "The library for AppStream compose support."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.16.1"

RPM_NAME = "libappstream-compose0-0.16.1-3.1.aarch64.rpm"
RPM_HASH = "ae39a33f52ef4d4890f1e920c0838eff7a2360f4e04f5df2d753a5c4f74975e042e7d42bc2d41bbbddfc3678a34cfe21186978b95da326228ec8b6655d249dfa"

RPROVIDES:${PN} += "libappstream-compose.so.0()(64bit) \
libappstream-compose0 \
libappstream-compose0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libappstream.so.4()(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libcairo.so.2()(64bit) \
libfontconfig.so.1()(64bit) \
libfreetype.so.6()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libpango-1.0.so.0()(64bit) \
librsvg-2.so.2()(64bit) \
libyaml-0.so.2()(64bit)"

inherit rpm