SUMMARY = "Example video player based on libplacebo"
DESCRIPTION = "A small example video player based on libplacebo and FFmpeg. This provides little \
more than the ability to display video files, and rather serves as a tool to \
help understand and demonstrate the various options provided by libplacebo."
LICENSE = "LGPL-2.1-or-later"

PV = "6.292.0"

RPM_NAME = "plplay-6.292.0-1.1.aarch64.rpm"
RPM_HASH = "6f839ca13bbdc0c5c25c7c6065614ce5d3394fbebb9d5d8a47a91d7e13fe492cf2e61a634237a377987be1f3c0b0dd9d2069f88b7f2c48068df2290723843c94"

RPROVIDES:${PN} += "plplay"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libavcodec.so.60 \
libavformat.so.60 \
libavutil.so.58 \
libc.so.6 \
libglfw.so.3 \
libm.so.6 \
libplacebo.so.292"

inherit rpm
