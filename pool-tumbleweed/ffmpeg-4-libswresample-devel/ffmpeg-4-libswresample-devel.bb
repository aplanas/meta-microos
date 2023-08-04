SUMMARY = "Development files for the FFmpeg software resampling library"
DESCRIPTION = "The libswresample library performs audio conversion between different \
sample rates, channel layout and channel formats. \
 \
This subpackage contains the headers for FFmpeg libswresample."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.4"

RPM_NAME = "ffmpeg-4-libswresample-devel-4.4.4-2.2.aarch64.rpm"
RPM_HASH = "b65478a435a1d4c03f7f17fc85b50ad73bd40b86900ab54f60571064cf0a05a3daeba94c6e50c40cd5ecd08c3fbae41d87d38ab696b1cbef7cba365147a2ce13"

RPROVIDES:${PN} += "ffmpeg-4-libswresample-devel \
libswresample-devel \
pkgconfig-libswresample"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ffmpeg-4-libavutil-devel \
libswresample3-9 \
pkgconfig-libavutil"

inherit rpm
