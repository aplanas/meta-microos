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

RPROVIDES:${PN} += "libvorbis.so.0()(64bit) \
libvorbis0 \
libvorbis0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
libogg.so.0()(64bit)"

inherit rpm
