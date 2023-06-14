SUMMARY = "FFmpeg input plugin for the C* Music Player"
DESCRIPTION = "This package provides FFmpeg input support for the C* Music Player."
LICENSE = "GPL-2.0-only"

PV = "2.10.0"

RPM_NAME = "cmus-plugin-ffmpeg-2.10.0-2.1.aarch64.rpm"
RPM_HASH = "546bb97432e3fad016544f7ffbe990a83eebcd4e26eb3c2fe359103b2e11321651749e7e44a43b934cff8a027ef2dc2a1f6c1922826245f3f5991a7d02af18e1"

RPROVIDES:${PN} += "cmus-plugin-ffmpeg"

RDEPENDS:${PN} += "cmus \
ld-linux-aarch64.so.1 \
libavcodec.so.60 \
libavformat.so.60 \
libc.so.6 \
libswresample.so.4"

inherit rpm
