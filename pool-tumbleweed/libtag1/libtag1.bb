SUMMARY = "Audio Meta-Data Library"
DESCRIPTION = "TagLib is a library for reading and editing the meta-data of several popular \
audio formats. Currently it supports both ID3v1 and ID3v2 for MP3 files, Ogg \
Vorbis comments and ID3 tags and Vorbis comments in FLAC, MPC, Speex, WavPack \
TrueAudio, WAV, AIFF, MP4 and ASF files."
LICENSE = "LGPL-2.1-or-later"

PV = "1.13"

RPM_NAME = "libtag1-1.13-1.3.aarch64.rpm"
RPM_HASH = "57b57d5bfb3a101d3b7c88076186dc7db194a5a3558227716656c23cdbe529301b087cc8918141f55cb35835d742468fb50a1c39d04ec9e18d9f2f39d748d8af"

RPROVIDES:${PN} += "libtag.so.1 \
libtag1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
