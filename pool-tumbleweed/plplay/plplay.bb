SUMMARY = "Example video player based on libplacebo"
DESCRIPTION = "A small example video player based on libplacebo and FFmpeg. This provides little \
more than the ability to display video files, and rather serves as a tool to \
help understand and demonstrate the various options provided by libplacebo."
LICENSE = "LGPL-2.1-or-later"

PV = "6.292.1"

RPM_NAME = "plplay-6.292.1-1.1.aarch64.rpm"
RPM_HASH = "0cbdfbb720ef5f9efac2be97d9b2638c7dc8a66465c717e9744f6b6c94def5df880d5faadf1370c63e841fa8de1cde577de171b9c55594bc74f7751694466d23"

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
