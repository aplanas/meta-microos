SUMMARY = "Development files for FFmpeg's codec library"
DESCRIPTION = "The libavcodec library provides a generic encoding/decoding framework \
and contains multiple decoders and encoders for audio, video and \
subtitle streams, and several bitstream filters. \
 \
This subpackage contains the headers for FFmpeg libavcodec."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.4"

RPM_NAME = "ffmpeg-4-libavcodec-devel-4.4.4-2.2.aarch64.rpm"
RPM_HASH = "c9f4c166d9e027f0cebfa062ae0c5b5c03f9d04b852d4c1568975697a4ccd294fbc4ee219bd250d930432fe8308437166ecc7629dfa877f28e5406fb614c37cf"

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
