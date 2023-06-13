SUMMARY = "SDL Support for mpg123"
DESCRIPTION = "The mpg123 distribution contains a real time MPEG 1.0/2.0/2.5 audio player/decoder for \
layers 1,2 and 3 (most commonly MPEG 1.0 layer 3 aka MP3), as well as re-usable decoding \
and output libraries. \
 \
This package contains the plugin for SDL output support."
LICENSE = "LGPL-2.1-only"

PV = "1.31.3"

RPM_NAME = "mpg123-sdl-1.31.3-1.2.aarch64.rpm"
RPM_HASH = "d745689542481dba622b0f1a7618a15cf79b3db10e69e8633b0169273e8d279495314fa8fad4b6cffc38639f689571ce4f026c8f86e3131b282298edb6edd371"

RPROVIDES:${PN} += "mpg123-sdl \
mpg123-sdl(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libSDL-1.2.so.0()(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
