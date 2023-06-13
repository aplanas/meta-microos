SUMMARY = "MP3 Encoder for RTP Streaming"
DESCRIPTION = "LAME is an encoder that converts audio to the MP3 file format. It has \
an improved psychoacoustic model and performs well in codec listening \
tests. \
 \
This package includes 'mp3rtp', an MP3 encoder with RTP streaming of the output."
LICENSE = "LGPL-2.0-or-later"

PV = "3.100"

RPM_NAME = "lame-mp3rtp-3.100-5.3.aarch64.rpm"
RPM_HASH = "e84cf2ec7e0dc9c9220ea9e81d315cd6b86ccc21e2caa9bdc5a2d8be3f9f217727892040a9474174ffcf67e628fb48daed58db44f659e4811a20b35dea86cc2e"

RPROVIDES:${PN} += "lame-mp3rtp \
lame-mp3rtp(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libmp3lame.so.0()(64bit) \
libmp3lame0 \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit)"

inherit rpm
