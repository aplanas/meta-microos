SUMMARY = "Portaudio Support for mpg123"
DESCRIPTION = "The mpg123 distribution contains a real time MPEG 1.0/2.0/2.5 audio player/decoder for \
layers 1,2 and 3 (most commonly MPEG 1.0 layer 3 aka MP3), as well as re-usable decoding \
and output libraries. \
 \
This package contains the plugin for Portaudio output support."
LICENSE = "LGPL-2.1-only"

PV = "1.31.3"

RPM_NAME = "mpg123-portaudio-1.31.3-1.3.aarch64.rpm"
RPM_HASH = "07e9875692b13123eba625def0ebcc9558a025469aa34ef6ca666e840b70d594f4eeba29803bf765d48dfadc6b2329d578672a80836ba59501a34ef4d2a14e03"

RPROVIDES:${PN} += "mpg123-portaudio"

RDEPENDS:${PN} += "libc.so.6 \
libportaudio.so.2"

inherit rpm
