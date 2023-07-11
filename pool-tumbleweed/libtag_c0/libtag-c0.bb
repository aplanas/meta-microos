SUMMARY = "Audio Meta-Data Library"
DESCRIPTION = "TagLib is a library for reading and editing the meta-data of several popular \
audio formats. Currently it supports both ID3v1 and ID3v2 for MP3 files, Ogg \
Vorbis comments and ID3 tags and Vorbis comments in FLAC, MPC, Speex, WavPack \
TrueAudio, WAV, AIFF, MP4 and ASF files."
LICENSE = "LGPL-2.1-or-later"

PV = "1.13"

RPM_NAME = "libtag_c0-1.13-1.4.aarch64.rpm"
RPM_HASH = "5c794f6869d5185ff04a7add17d51748b076783687ca6ee76974e2eb50f9d0319baa1f174c336048d634c1a8aa97b34db6e16d1716f714139fd072fbd47b2dd2"

RPROVIDES:${PN} += "libtag-c.so.0 \
libtag-c0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libtag.so.1"

inherit rpm
