SUMMARY = "SDL Support for mpg123"
DESCRIPTION = "The mpg123 distribution contains a real time MPEG 1.0/2.0/2.5 audio player/decoder for \
layers 1,2 and 3 (most commonly MPEG 1.0 layer 3 aka MP3), as well as re-usable decoding \
and output libraries. \
 \
This package contains the plugin for SDL output support."
LICENSE = "LGPL-2.1-only"

PV = "1.31.3"

RPM_NAME = "mpg123-sdl-1.31.3-1.3.aarch64.rpm"
RPM_HASH = "7ec58d93a73374315fb0d594e73340965f6420f1c9ea54b1bc8746ffbf53dcb56027ad54d9d9eeafab00dda4e9bd48f432dec98e6c9d791242983f215bf1f820"

RPROVIDES:${PN} += "mpg123-sdl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL-1.2.so.0 \
libc.so.6"

inherit rpm
