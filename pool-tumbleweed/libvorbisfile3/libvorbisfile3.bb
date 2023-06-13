SUMMARY = "The Vorbis General Audio Compression Codec"
DESCRIPTION = "Vorbis is a fully open, nonproprietary, patent-and-royalty-free, and \
general-purpose compressed audio format for audio and music at fixed \
and variable bit rates from 16 to 128 kbps/channel. \
 \
The native bitstream format of Vorbis is libogg (Ogg). Alternatively, \
libmatroska (matroska) can also be used."
LICENSE = "BSD-3-Clause"

PV = "1.3.7"

RPM_NAME = "libvorbisfile3-1.3.7-4.1.aarch64.rpm"
RPM_HASH = "e5f75085e09979c5cf4bc4ed1460916770afd9dee0b4d83f37e35d8bd581b039a6ea2a886bca23e0140f7178ef481cb9197d1aef489ff7073666275644475bf0"

RPROVIDES:${PN} += "libvorbisfile.so.3()(64bit) \
libvorbisfile3 \
libvorbisfile3(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libogg.so.0()(64bit) \
libvorbis.so.0()(64bit)"

inherit rpm
