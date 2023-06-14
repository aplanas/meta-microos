SUMMARY = "Library to create, manipulate and render SVG files"
DESCRIPTION = "Dynamic libraries from wxsvg, as required at runtime."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "1.5.23"

RPM_NAME = "libwxsvg3-1.5.23-4.3.aarch64.rpm"
RPM_HASH = "6e2a457c40a761bc875a16d521ebc106231b3c91b81f563905809aef1279432292488f5736450a43624553bd719cd8da047a42f6aec44b32dbf7b247f861a9fd"

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
