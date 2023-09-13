SUMMARY = "Development files for the FFmpeg software resampling library"
DESCRIPTION = "The libswresample library performs audio conversion between different \
sample rates, channel layout and channel formats. \
 \
This subpackage contains the headers for FFmpeg libswresample."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.4"

RPM_NAME = "ffmpeg-4-libswresample-devel-4.4.4-2.3.aarch64.rpm"
RPM_HASH = "e8841490f39a847efef09e884bb2134fb9495b83d327a2965b6b39a365346426e8ef1d03fe9bc286800ac49fda2ff43db61b773be0a1f1c264d7fc0a0a5fe290"

RPROVIDES:${PN} += "ffmpeg-4-libswresample-devel \
libswresample-devel \
pkgconfig-libswresample"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ffmpeg-4-libavutil-devel \
libswresample3-9 \
pkgconfig-libavutil"

inherit rpm
