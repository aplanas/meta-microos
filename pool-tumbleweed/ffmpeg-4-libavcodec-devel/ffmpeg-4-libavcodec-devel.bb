SUMMARY = "Development files for FFmpeg's codec library"
DESCRIPTION = "The libavcodec library provides a generic encoding/decoding framework \
and contains multiple decoders and encoders for audio, video and \
subtitle streams, and several bitstream filters. \
 \
This subpackage contains the headers for FFmpeg libavcodec."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.4"

RPM_NAME = "ffmpeg-4-libavcodec-devel-4.4.4-2.1.aarch64.rpm"
RPM_HASH = "a991ed9e2a93a9193e62be644958c3a0be58cdcb7a52e0592584c9123eec9708d6b0f8911b56785e28d8bdebe0976b98bea12577e9121d90040a2b893e9a47b2"

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
