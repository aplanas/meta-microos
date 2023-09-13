SUMMARY = "Development files for libavresample as present in FFmpeg"
DESCRIPTION = "An audio resampling library that is being provided for drop-in \
compatibility with libav. \
 \
It is advised to use libswresample for new code. \
 \
This subpackage contains the headers for FFmpeg's copy of libavresample."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.4"

RPM_NAME = "ffmpeg-4-libavresample-devel-4.4.4-2.3.aarch64.rpm"
RPM_HASH = "26a53ffe787ceb0c204dea6ea1fd01dcbbe0558672fc03997592f410bb6e19bb45c776ecfb3ad77ac2578b0adce08d456e0105db16d349f357a2e4a9b6a18000"

RPROVIDES:${PN} += "ffmpeg-4-libavresample-devel \
libavresample-devel \
pkgconfig-libavresample"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ffmpeg-4-libavutil-devel \
libavresample4-0 \
pkgconfig-libavutil"

inherit rpm
