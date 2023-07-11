SUMMARY = "Development files for FFmpeg's codec library"
DESCRIPTION = "The libavcodec library provides a generic encoding/decoding framework \
and contains multiple decoders and encoders for audio, video and \
subtitle streams, and several bitstream filters. \
 \
This subpackage contains the headers for FFmpeg libavcodec."
LICENSE = "GPL-3.0-or-later"

PV = "5.1.3"

RPM_NAME = "ffmpeg-5-libavcodec-devel-5.1.3-2.1.aarch64.rpm"
RPM_HASH = "e25d40be8fea9fb9ce88922d2783e09eec51beeff0c02701b0a0ead2fa2e877b051691c10b9be4005a31ef18438b21d4dae6479f427383800e6278d20263b9b2"

RPROVIDES:${PN} += "ffmpeg-5-libavcodec-devel \
libavcodec-devel \
pkgconfig-libavcodec"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ffmpeg-5-libavutil-devel \
libavcodec59 \
pkgconfig-libavutil \
pkgconfig-libswresample"

inherit rpm
