SUMMARY = "Jack Support for mpg123"
DESCRIPTION = "The mpg123 distribution contains a real time MPEG 1.0/2.0/2.5 audio player/decoder for \
layers 1,2 and 3 (most commonly MPEG 1.0 layer 3 aka MP3), as well as re-usable decoding \
and output libraries. \
 \
This package contains the plugin for JACK output support."
LICENSE = "LGPL-2.1-only"

PV = "1.31.3"

RPM_NAME = "mpg123-jack-1.31.3-1.2.aarch64.rpm"
RPM_HASH = "691c38f308bced32e36d8bf0fb53127e4d1a266123709fc05377e3ba9a5c64877477d4cbd848da874127ddaa2756ca8400dac3c09c03e63b1f18952499fb7036"

RPROVIDES:${PN} += "mpg123-jack"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libjack.so.0"

inherit rpm
