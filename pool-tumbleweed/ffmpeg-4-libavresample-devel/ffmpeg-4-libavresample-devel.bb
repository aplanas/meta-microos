SUMMARY = "Development files for libavresample as present in FFmpeg"
DESCRIPTION = "An audio resampling library that is being provided for drop-in \
compatibility with libav. \
 \
It is advised to use libswresample for new code. \
 \
This subpackage contains the headers for FFmpeg's copy of libavresample."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.4"

RPM_NAME = "ffmpeg-4-libavresample-devel-4.4.4-2.2.aarch64.rpm"
RPM_HASH = "d49cc9f3901cadaf84d629f31d38b67f2aa34081ad255fb9cf0579c85ad1dcbe33315761e2c46b3bd9ad84fae7d46e9550c64c379252c802e52653a18f7820f2"

RPROVIDES:${PN} += "ffmpeg-4-libavresample-devel \
libavresample-devel \
pkgconfig-libavresample"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ffmpeg-4-libavutil-devel \
libavresample4-0 \
pkgconfig-libavutil"

inherit rpm
