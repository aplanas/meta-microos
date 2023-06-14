SUMMARY = "Audio Meta-Data Library"
DESCRIPTION = "TagLib is a library for reading and editing the meta-data of several popular \
audio formats. Currently it supports both ID3v1 and ID3v2 for MP3 files, Ogg \
Vorbis comments and ID3 tags and Vorbis comments in FLAC, MPC, Speex, WavPack \
TrueAudio, WAV, AIFF, MP4 and ASF files. \
This package contains built examples which manipulate tags from the \
command line."
LICENSE = "LGPL-2.1-or-later & MPL-1.1"

PV = "1.13"

RPM_NAME = "taglib-1.13-1.3.aarch64.rpm"
RPM_HASH = "5576e1ac9547ddc355566c3adee8fa7da82a92b84f59a48fd43326f05059d1da49573cc95adcb39d55c6bbcf505aa43a5f32cacfaf309717e8851f3da7d3eeff"

RPROVIDES:${PN} += "taglib"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libtag-c.so.0 \
libtag-c0 \
libtag.so.1 \
libtag1"

inherit rpm
