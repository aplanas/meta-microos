SUMMARY = "The Vorbis General Audio Compression Codec"
DESCRIPTION = "Vorbis is a fully open, nonproprietary, patent-and-royalty-free, and \
general-purpose compressed audio format for audio and music at fixed \
and variable bit rates from 16 to 128 kbps/channel. \
 \
The native bitstream format of Vorbis is libogg (Ogg). Alternatively, \
libmatroska (matroska) can also be used."
LICENSE = "BSD-3-Clause"

PV = "1.3.7"

RPM_NAME = "libvorbis0-1.3.7-4.1.aarch64.rpm"
RPM_HASH = "c1f78891f3269ea5c713c7a614e0cfe93726cf6077861691765c4dcfc015729dfd1b516c5cb32fb87c0161de3aa602c47771bd3df35e59736bf034fd01b29178"

RPROVIDES:${PN} += "libvorbis.so.0 \
libvorbis0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libogg.so.0"

inherit rpm
