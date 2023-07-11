SUMMARY = "Library to create, manipulate and render SVG files"
DESCRIPTION = "Dynamic libraries from wxsvg, as required at runtime."
LICENSE = "LGPL-2.1-or-later-with-WxWindows-exception-3.1"

PV = "1.5.23"

RPM_NAME = "libwxsvg3-1.5.23-4.4.aarch64.rpm"
RPM_HASH = "bb61bd8565d8d9622a50d62d4156f94f6a296c2094a838210307833301eab6c8a2450e99846b2a21e0125b9d7496d2023dda6939f6d5083b93eab1f655dc0fa2"

RPROVIDES:${PN} += "libwxsvg.so.3 \
libwxsvg3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libavcodec.so.60 \
libavformat.so.60 \
libavutil.so.58 \
libc.so.6 \
libcairo.so.2 \
libexif.so.12 \
libexpat.so.1 \
libgcc-s.so.1 \
libgobject-2.0.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libstdc++.so.6 \
libswscale.so.7 \
libwx-baseu-suse.so.9.0.0 \
libwx-gtk3u-core-suse.so.9.0.0"

inherit rpm
