SUMMARY = "Backend ffmpeg/libav for pqiv"
DESCRIPTION = "Backend ffmpeg/libav for pqiv"
LICENSE = "GPL-3.0-or-later"

PV = "2.12"

RPM_NAME = "pqiv-ffmpeg-2.12-1.4.aarch64.rpm"
RPM_HASH = "a70f66afe4e4d0dd4d021a2f168c0764c68eef3ef5893354c2007bd2a8913bc57b9299e8b80051e88d021ef2398b8d37b5c08d0982f41ee58ef763f9ec509567"

RPROVIDES:${PN} += "pqiv-ffmpeg"

RDEPENDS:${PN} += "libavcodec.so.60 \
libavformat.so.60 \
libavutil.so.58 \
libc.so.6 \
libcairo.so.2 \
libglib-2.0.so.0 \
libgtk-3.so.0 \
libswscale.so.7 \
pqiv"

inherit rpm
