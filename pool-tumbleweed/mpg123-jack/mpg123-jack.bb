SUMMARY = "Jack Support for mpg123"
DESCRIPTION = "The mpg123 distribution contains a real time MPEG 1.0/2.0/2.5 audio player/decoder for \
layers 1,2 and 3 (most commonly MPEG 1.0 layer 3 aka MP3), as well as re-usable decoding \
and output libraries. \
 \
This package contains the plugin for JACK output support."
LICENSE = "LGPL-2.1-only"

PV = "1.31.3"

RPM_NAME = "mpg123-jack-1.31.3-1.3.aarch64.rpm"
RPM_HASH = "bbb2d1b85efdb47c1aaf3ce7a8b583d494c3eb5212abe919f9ed51eaec22754ca8d52de113bfe7c86722c9e05c18b675d49f6d3e9b8e15089f6ff1cec7e5ab44"

RPROVIDES:${PN} += "mpg123-jack"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libjack.so.0"

inherit rpm
