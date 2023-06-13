SUMMARY = "Library to create, manipulate and render SVG files"
DESCRIPTION = "Dynamic libraries from wxsvg, as required at runtime."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "1.5.23"

RPM_NAME = "libwxsvg3-1.5.23-4.3.aarch64.rpm"
RPM_HASH = "6e2a457c40a761bc875a16d521ebc106231b3c91b81f563905809aef1279432292488f5736450a43624553bd719cd8da047a42f6aec44b32dbf7b247f861a9fd"

RPROVIDES:${PN} += "libwxsvg.so.3()(64bit) \
libwxsvg3 \
libwxsvg3(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libavcodec.so.60()(64bit) \
libavformat.so.60()(64bit) \
libavutil.so.58()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libexif.so.12()(64bit) \
libexpat.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libgobject-2.0.so.0()(64bit) \
libm.so.6()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libswscale.so.7()(64bit) \
libwx_baseu-suse.so.9.0.0()(64bit) \
libwx_gtk3u_core-suse.so.9.0.0()(64bit)"

inherit rpm
