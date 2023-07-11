SUMMARY = "Example video player based on libplacebo"
DESCRIPTION = "A small example video player based on libplacebo and FFmpeg. This provides little \
more than the ability to display video files, and rather serves as a tool to \
help understand and demonstrate the various options provided by libplacebo."
LICENSE = "LGPL-2.1-or-later"

PV = "5.264.1"

RPM_NAME = "plplay-5.264.1-1.3.aarch64.rpm"
RPM_HASH = "1c3f4765c239f98295054990ca9c60b5cd970ef16d70ddac62381cdca4895a86d16ab6db8004025d0d5edb2854b73548584ab3e9303b1c98f72b2b1607737c83"

RPROVIDES:${PN} += "plplay"

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
