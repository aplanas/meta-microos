SUMMARY = "The Vorbis General Audio Compression Codec"
DESCRIPTION = "Vorbis is a fully open, nonproprietary, patent-and-royalty-free, and \
general-purpose compressed audio format for audio and music at fixed \
and variable bit rates from 16 to 128 kbps/channel. \
 \
The native bitstream format of Vorbis is libogg (Ogg). Alternatively, \
libmatroska (matroska) can also be used."
LICENSE = "BSD-3-Clause"

PV = "1.3.7"

RPM_NAME = "libvorbisenc2-1.3.7-4.1.aarch64.rpm"
RPM_HASH = "62c424cffac2ec1812e4385306388f837cf6cc30da86c397d818a6b90c0cb3ff0be2fb5a50b74764df0cb5fa83d035e29c151082c89397164fe25ca1eea3e4fe"

RPROVIDES:${PN} += "libvorbisenc.so.2 \
libvorbisenc2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libvorbis.so.0"

inherit rpm
