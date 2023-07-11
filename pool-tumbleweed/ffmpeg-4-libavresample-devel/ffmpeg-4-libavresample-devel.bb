SUMMARY = "Development files for libavresample as present in FFmpeg"
DESCRIPTION = "An audio resampling library that is being provided for drop-in \
compatibility with libav. \
 \
It is advised to use libswresample for new code. \
 \
This subpackage contains the headers for FFmpeg's copy of libavresample."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.4"

RPM_NAME = "ffmpeg-4-libavresample-devel-4.4.4-2.1.aarch64.rpm"
RPM_HASH = "7a70f49e1300bb0b30046b013244f7904de91823a9f17208deaa131c786c06f961c55e3ba08b06b4d72a71fe687ed7df75b39a57f745672135be1d989f4512a4"

RPROVIDES:${PN} += "ffmpeg-4-libavresample-devel \
libavresample-devel \
pkgconfig-libavresample"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ffmpeg-4-libavutil-devel \
libavresample4-0 \
pkgconfig-libavutil"

inherit rpm
