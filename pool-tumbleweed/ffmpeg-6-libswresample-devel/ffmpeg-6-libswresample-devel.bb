SUMMARY = "Development files for the FFmpeg software resampling library"
DESCRIPTION = "The libswresample library performs audio conversion between different \
sample rates, channel layout and channel formats. \
 \
This subpackage contains the headers for FFmpeg libswresample."
LICENSE = "GPL-3.0-or-later"

PV = "6.0"

RPM_NAME = "ffmpeg-6-libswresample-devel-6.0-2.4.aarch64.rpm"
RPM_HASH = "da992471dd7b299db244ab022370a2393b6c60bea30ebdde94e2be3d564de5123aa095df5e6033faa476d4b4fb7a8902b04358f78832445f2944e050564b23ff"

RPROVIDES:${PN} += "ffmpeg-6-libswresample-devel \
libswresample-devel \
pkgconfig-libswresample"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ffmpeg-6-libavutil-devel \
libswresample4 \
pkgconfig-libavutil"

inherit rpm
