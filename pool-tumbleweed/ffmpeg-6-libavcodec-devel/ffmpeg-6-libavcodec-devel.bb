SUMMARY = "Development files for FFmpeg's codec library"
DESCRIPTION = "The libavcodec library provides a generic encoding/decoding framework \
and contains multiple decoders and encoders for audio, video and \
subtitle streams, and several bitstream filters. \
 \
This subpackage contains the headers for FFmpeg libavcodec."
LICENSE = "GPL-3.0-or-later"

PV = "6.0"

RPM_NAME = "ffmpeg-6-libavcodec-devel-6.0-3.1.aarch64.rpm"
RPM_HASH = "2762da8cbd660b7e52557975e1bd76e4e1693a77f071cb1e92c103a0396ee17bafdc3adcbbb94acb1bb119e341239fa50635b9df6b7402c996e572bc69abfe96"

RPROVIDES:${PN} += "ffmpeg-6-libavcodec-devel \
libavcodec-devel \
pkgconfig-libavcodec"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ffmpeg-6-libavutil-devel \
libavcodec60 \
pkgconfig-libavutil \
pkgconfig-libswresample"

inherit rpm
