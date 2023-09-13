SUMMARY = "Development files for FFmpeg's codec library"
DESCRIPTION = "The libavcodec library provides a generic encoding/decoding framework \
and contains multiple decoders and encoders for audio, video and \
subtitle streams, and several bitstream filters. \
 \
This subpackage contains the headers for FFmpeg libavcodec."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.4"

RPM_NAME = "ffmpeg-4-libavcodec-devel-4.4.4-2.3.aarch64.rpm"
RPM_HASH = "ac90c2bd01d66b13f33a7b11de8ec1247f199dc7540c677d7900861e7cb76552cb17254dabe4653d6eb101781b89fa41605b71b31da58184361f3b8112cf2e10"

RPROVIDES:${PN} += "ffmpeg-4-libavcodec-devel \
libavcodec-devel \
pkgconfig-libavcodec"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ffmpeg-4-libavresample-devel \
ffmpeg-4-libavutil-devel \
libavcodec58-134 \
pkgconfig-libavutil \
pkgconfig-libswresample"

inherit rpm
