SUMMARY = "Development files for the FFmpeg software resampling library"
DESCRIPTION = "The libswresample library performs audio conversion between different \
sample rates, channel layout and channel formats. \
 \
This subpackage contains the headers for FFmpeg libswresample."
LICENSE = "GPL-3.0-or-later"

PV = "5.1.3"

RPM_NAME = "ffmpeg-5-libswresample-devel-5.1.3-2.1.aarch64.rpm"
RPM_HASH = "05121471617a928afa1d415a9562a0847fb78da585e096eea1dfa06418d69b461fe3ba402a33f23e8d9e8d78988cb91301b96d73b8fc389c22cdc9ad49f6be1c"

RPROVIDES:${PN} += "ffmpeg-5-libswresample-devel \
libswresample-devel \
pkgconfig-libswresample"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ffmpeg-5-libavutil-devel \
libswresample4-ff5 \
pkgconfig-libavutil"

inherit rpm
