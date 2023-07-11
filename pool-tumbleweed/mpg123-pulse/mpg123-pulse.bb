SUMMARY = "Pulseaudio Support for mpg123"
DESCRIPTION = "The mpg123 distribution contains a real time MPEG 1.0/2.0/2.5 audio player/decoder for \
layers 1,2 and 3 (most commonly MPEG 1.0 layer 3 aka MP3), as well as re-usable decoding \
and output libraries. \
 \
This package contains the plugin for Pulseaudio output support."
LICENSE = "LGPL-2.1-only"

PV = "1.31.3"

RPM_NAME = "mpg123-pulse-1.31.3-1.3.aarch64.rpm"
RPM_HASH = "d5755849a9961fb8ef736ab202d830779b47c3a5e84a07ff5df0ce160ebea1cc6050212f1c5f8398376376400db682a672f5dedff06732221abe65016f0a91de"

RPROVIDES:${PN} += "mpg123-pulse"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpulse-simple.so.0 \
libpulse.so.0"

inherit rpm
