SUMMARY = "Cross-platform GUI library"
DESCRIPTION = "ZLibrary is a cross-platform library to build applications running on \
desktop Linux, Windows, and different Linux-based PDAs."
LICENSE = "GPL-2.0+"

PV = "0.99.4"

RPM_NAME = "zlibrary0_99-0.99.4-3.28.aarch64.rpm"
RPM_HASH = "df58e4acc40ecc4c84a1f64eac918102ef00a3e04380023b0f6380480e864b9e3d38c284b58762161ad948c84b41cad40cf04eb2c010ac1510e162dc4f11254c"

RPROVIDES:${PN} += "libzlcore.so.0.99 \
libzltext.so.0.99 \
zlibrary0-99"

RDEPENDS:${PN} += "/sbin/ldconfig \
libbz2.so.1 \
libc.so.6 \
libexpat.so.1 \
libfribidi.so.0 \
libstdc++.so.6 \
libunibreak.so.5 \
libz.so.1 \
zlibrary-data \
zlibrary-ui"

inherit rpm
