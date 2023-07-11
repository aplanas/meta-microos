SUMMARY = "OpenAL Support for mpg123"
DESCRIPTION = "The mpg123 distribution contains a real time MPEG 1.0/2.0/2.5 audio player/decoder for \
layers 1,2 and 3 (most commonly MPEG 1.0 layer 3 aka MP3), as well as re-usable decoding \
and output libraries. \
 \
This package contains the plugin for openal output support."
LICENSE = "LGPL-2.1-only"

PV = "1.31.3"

RPM_NAME = "mpg123-openal-1.31.3-1.3.aarch64.rpm"
RPM_HASH = "d1ef17733d91e662eef55ed95c7cd8debfbb1fe2aa58a66b73bfe514fe19afe3ccc4062aed22b1ba3da3a35520336effdcae65f0649b433ede076890404dd240"

RPROVIDES:${PN} += "mpg123-openal"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libopenal.so.1"

inherit rpm
