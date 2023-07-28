SUMMARY = "Audio Meta-Data Library"
DESCRIPTION = "TagLib is a library for reading and editing the meta-data of several popular \
audio formats. Currently it supports both ID3v1 and ID3v2 for MP3 files, Ogg \
Vorbis comments and ID3 tags and Vorbis comments in FLAC, MPC, Speex, WavPack \
TrueAudio, WAV, AIFF, MP4 and ASF files. \
This package contains built examples which manipulate tags from the \
command line."
LICENSE = "LGPL-2.1-or-later & MPL-1.1"

PV = "1.13.1"

RPM_NAME = "taglib-1.13.1-1.1.aarch64.rpm"
RPM_HASH = "cc2735123e52f28352cbd5c742b2a9a0d20364393d4d239df653df73f4896fe7525598aa38621873784ebc05575b59645dec323bf9669f9f3841109e2854b0a3"

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
