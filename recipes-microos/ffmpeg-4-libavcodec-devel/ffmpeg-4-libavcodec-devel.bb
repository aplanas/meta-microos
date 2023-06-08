SUMMARY = "Development files for FFmpeg's codec library"
DESCRIPTION = "The libavcodec library provides a generic encoding/decoding framework \
and contains multiple decoders and encoders for audio, video and \
subtitle streams, and several bitstream filters. \
 \
This subpackage contains the headers for FFmpeg libavcodec."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.4"

RPM_NAME = "ffmpeg-4-libavcodec-devel-4.4.4-1.1.aarch64.rpm"
RPM_HASH = "5b45f134a69ba59324c55a50ff731103d88f68cb1c0f129c2d5ce5866104cadd4a04d80348582595f7d2e2860123474b96e40ca8358e3ba8b0da4631edc60018"

RPROVIDES:${PN} += "ffmpeg-4-libavcodec-devel ffmpeg-4-libavcodec-devel(aarch-64) libavcodec-devel pkgconfig(libavcodec)"
RDEPENDS:${PN} += "/usr/bin/pkg-config ffmpeg-4-libavresample-devel ffmpeg-4-libavutil-devel libavcodec58_134 pkgconfig(libavutil) pkgconfig(libswresample)"

inherit rpm
