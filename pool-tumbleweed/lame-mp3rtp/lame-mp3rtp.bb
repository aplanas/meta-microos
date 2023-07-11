SUMMARY = "MP3 Encoder for RTP Streaming"
DESCRIPTION = "LAME is an encoder that converts audio to the MP3 file format. It has \
an improved psychoacoustic model and performs well in codec listening \
tests. \
 \
This package includes 'mp3rtp', an MP3 encoder with RTP streaming of the output."
LICENSE = "LGPL-2.0-or-later"

PV = "3.100"

RPM_NAME = "lame-mp3rtp-3.100-5.4.aarch64.rpm"
RPM_HASH = "fef5592d71b4030ef65ca5c31f731763b986c8df4734857acd0eb7b661201c5631e8a99b40e645c8ce36bd87d1fb32f8fdd15a4241ef7690fe0dcf4bd576aa0b"

RPROVIDES:${PN} += "lame-mp3rtp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libmp3lame.so.0 \
libmp3lame0 \
libtinfo.so.6"

inherit rpm
