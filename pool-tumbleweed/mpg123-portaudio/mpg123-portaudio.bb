SUMMARY = "Portaudio Support for mpg123"
DESCRIPTION = "The mpg123 distribution contains a real time MPEG 1.0/2.0/2.5 audio player/decoder for \
layers 1,2 and 3 (most commonly MPEG 1.0 layer 3 aka MP3), as well as re-usable decoding \
and output libraries. \
 \
This package contains the plugin for Portaudio output support."
LICENSE = "LGPL-2.1-only"

PV = "1.31.3"

RPM_NAME = "mpg123-portaudio-1.31.3-1.2.aarch64.rpm"
RPM_HASH = "8cf007992e1f1db01c07453216cdee55ef892f954c062dcd8088cde7197ffdf1e6f26c3417c0ca4421c49a1ce6269507fd390bb4b53b406c57d06a95de708c07"

RPROVIDES:${PN} += "mpg123-portaudio \
mpg123-portaudio(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit) \
libportaudio.so.2()(64bit)"

inherit rpm
