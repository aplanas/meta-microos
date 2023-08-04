SUMMARY = "Example video player based on libplacebo"
DESCRIPTION = "A small example video player based on libplacebo and FFmpeg. This provides little \
more than the ability to display video files, and rather serves as a tool to \
help understand and demonstrate the various options provided by libplacebo."
LICENSE = "LGPL-2.1-or-later"

PV = "5.264.1"

RPM_NAME = "plplay5-5.264.1-1.1.aarch64.rpm"
RPM_HASH = "da8aba5f2cdf91a7a2e86aa62942178ce8e8c25cb5f0a7c52e94c907f7c6d7cc7177c2363914a43bc114914ffe63bc6b0e21b958c9b706612d5922820d91e786"

RPROVIDES:${PN} += "plplay5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libavcodec.so.60 \
libavformat.so.60 \
libavutil.so.58 \
libc.so.6 \
libglfw.so.3 \
libm.so.6 \
libplacebo.so.264"

inherit rpm
