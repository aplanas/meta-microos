SUMMARY = "Audio Meta-Data Library"
DESCRIPTION = "TagLib is a library for reading and editing the meta-data of several popular \
audio formats. Currently it supports both ID3v1 and ID3v2 for MP3 files, Ogg \
Vorbis comments and ID3 tags and Vorbis comments in FLAC, MPC, Speex, WavPack \
TrueAudio, WAV, AIFF, MP4 and ASF files."
LICENSE = "LGPL-2.1-or-later"

PV = "1.13.1"

RPM_NAME = "libtag1-1.13.1-1.1.aarch64.rpm"
RPM_HASH = "ea5a96c6131cbfeb2d5ab59ff867efcb691f105dda9374ddf351e83f40d03218864f5f8ebd0a4325175bcc486740cfc792c005ee813a97bfc9eed6e733260528"

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
