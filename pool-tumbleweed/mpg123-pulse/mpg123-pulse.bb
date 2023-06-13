SUMMARY = "Pulseaudio Support for mpg123"
DESCRIPTION = "The mpg123 distribution contains a real time MPEG 1.0/2.0/2.5 audio player/decoder for \
layers 1,2 and 3 (most commonly MPEG 1.0 layer 3 aka MP3), as well as re-usable decoding \
and output libraries. \
 \
This package contains the plugin for Pulseaudio output support."
LICENSE = "LGPL-2.1-only"

PV = "1.31.3"

RPM_NAME = "mpg123-pulse-1.31.3-1.2.aarch64.rpm"
RPM_HASH = "91958df6589c49cc91049b678019143f779644216a53432b28f4beb867e646ac402c5e261310b5f3cf3ad417a0d029293b63a0469f7f750556c0ce459c05bf3b"

RPROVIDES:${PN} += "mpg123-pulse \
mpg123-pulse(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libpulse-simple.so.0()(64bit) \
libpulse-simple.so.0(PULSE_0)(64bit) \
libpulse.so.0()(64bit) \
libpulse.so.0(PULSE_0)(64bit)"

inherit rpm
