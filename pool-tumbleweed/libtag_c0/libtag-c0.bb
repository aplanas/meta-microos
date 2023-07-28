SUMMARY = "Audio Meta-Data Library"
DESCRIPTION = "TagLib is a library for reading and editing the meta-data of several popular \
audio formats. Currently it supports both ID3v1 and ID3v2 for MP3 files, Ogg \
Vorbis comments and ID3 tags and Vorbis comments in FLAC, MPC, Speex, WavPack \
TrueAudio, WAV, AIFF, MP4 and ASF files."
LICENSE = "LGPL-2.1-or-later"

PV = "1.13.1"

RPM_NAME = "libtag_c0-1.13.1-1.1.aarch64.rpm"
RPM_HASH = "0d22010c2ca3e96081d70425b3cf8f65bf30eac8da7174af74865baa978f34a82fac603345b8138bc4c4b86fe0383ffd337192ccea20b7fd164de60d50089813"

RPROVIDES:${PN} += "libtag-c.so.0 \
libtag-c0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libtag.so.1"

inherit rpm
