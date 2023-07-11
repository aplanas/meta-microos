SUMMARY = "Audio Meta-Data Library"
DESCRIPTION = "TagLib is a library for reading and editing the meta-data of several popular \
audio formats. Currently it supports both ID3v1 and ID3v2 for MP3 files, Ogg \
Vorbis comments and ID3 tags and Vorbis comments in FLAC, MPC, Speex, WavPack \
TrueAudio, WAV, AIFF, MP4 and ASF files."
LICENSE = "LGPL-2.1-or-later"

PV = "1.13"

RPM_NAME = "libtag1-1.13-1.4.aarch64.rpm"
RPM_HASH = "e889ce26ec54e7c84fe5c96c9fb7119151e2fcb4f39802c78b91b763737c3beeaff35c402132b776ee6988218b63f57526434d70c1c51f442e9452a1b80df0f1"

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
