SUMMARY = "Backend ffmpeg/libav for pqiv"
DESCRIPTION = "Backend ffmpeg/libav for pqiv"
LICENSE = "GPL-3.0-or-later"

PV = "2.12"

RPM_NAME = "pqiv-ffmpeg-2.12-1.4.aarch64.rpm"
RPM_HASH = "a70f66afe4e4d0dd4d021a2f168c0764c68eef3ef5893354c2007bd2a8913bc57b9299e8b80051e88d021ef2398b8d37b5c08d0982f41ee58ef763f9ec509567"

RPROVIDES:${PN} += "pqiv-ffmpeg \
pqiv-ffmpeg(aarch-64)"

RDEPENDS:${PN} += "libavcodec.so.60()(64bit) \
libavcodec.so.60(LIBAVCODEC_60.3_SUSE)(64bit) \
libavformat.so.60()(64bit) \
libavformat.so.60(LIBAVFORMAT_60.3_SUSE)(64bit) \
libavutil.so.58()(64bit) \
libavutil.so.58(LIBAVUTIL_58.2_SUSE)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcairo.so.2()(64bit) \
libglib-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libswscale.so.7()(64bit) \
libswscale.so.7(LIBSWSCALE_7.1_SUSE)(64bit) \
pqiv"

inherit rpm
