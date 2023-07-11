SUMMARY = "Wrapper library around libffmpeg"
DESCRIPTION = "FFmpegSource (usually known as FFMS or FFMS2) is a wrapper \
library around FFmpeg, plus some additional components to deal with file \
formats libavformat has (or used to have) problems with."
LICENSE = "MIT"

PV = "2.40+44"

RPM_NAME = "libffms2-5-2.40+44-1.6.aarch64.rpm"
RPM_HASH = "8e2a19d985ee3ae14fff99d63aaf2979f55569f58acf5e288afe85959db07f99ec51d7a3c3dd8aa5efb6d0e5871b25f9e400f10cd92918794407b0bb2079946f"

RPROVIDES:${PN} += "libffms2-5 \
libffms2.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libavcodec.so.60 \
libavformat.so.60 \
libavutil.so.58 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libswresample.so.4 \
libswscale.so.7 \
libz.so.1"

inherit rpm
