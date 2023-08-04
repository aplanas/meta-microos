SUMMARY = "Development files for the FFmpeg software resampling library"
DESCRIPTION = "The libswresample library performs audio conversion between different \
sample rates, channel layout and channel formats. \
 \
This subpackage contains the headers for FFmpeg libswresample."
LICENSE = "GPL-3.0-or-later"

PV = "6.0"

RPM_NAME = "ffmpeg-6-libswresample-devel-6.0-3.1.aarch64.rpm"
RPM_HASH = "c974264fb34379e170a56190744007d6c87aa78be9489bfc876f651c5c85dc92a2678330ba6839254d42b078936aa240fcb58a9562702b456ae1d4eb7e8941e6"

RPROVIDES:${PN} += "ffmpeg-6-libswresample-devel \
libswresample-devel \
pkgconfig-libswresample"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ffmpeg-6-libavutil-devel \
libswresample4 \
pkgconfig-libavutil"

inherit rpm
