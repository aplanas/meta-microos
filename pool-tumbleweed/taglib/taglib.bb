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

RPROVIDES:${PN} += "taglib \
taglib(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libtag.so.1()(64bit) \
libtag1 \
libtag_c.so.0()(64bit) \
libtag_c0"

inherit rpm
