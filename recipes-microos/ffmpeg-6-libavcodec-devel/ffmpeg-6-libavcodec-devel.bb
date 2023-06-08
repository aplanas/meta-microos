SUMMARY = "Development files for FFmpeg's codec library"
DESCRIPTION = "The libavcodec library provides a generic encoding/decoding framework \
and contains multiple decoders and encoders for audio, video and \
subtitle streams, and several bitstream filters. \
 \
This subpackage contains the headers for FFmpeg libavcodec."
LICENSE = "GPL-3.0-or-later"

PV = "6.0"

RPM_NAME = "ffmpeg-6-libavcodec-devel-6.0-2.1.aarch64.rpm"
RPM_HASH = "e0c60ea22cc27a505677a14f0ba1e1fa04293af39ab67a94f3d5aede3d9fd5eaf595bd752d302941e3929f6e0fd88bbbdd15306266ac5a39ef9b9b1109b45e2d"

RPROVIDES:${PN} += "ffmpeg-6-libavcodec-devel ffmpeg-6-libavcodec-devel(aarch-64) libavcodec-devel pkgconfig(libavcodec)"
RDEPENDS:${PN} += "/usr/bin/pkg-config ffmpeg-6-libavutil-devel libavcodec60 pkgconfig(libavutil) pkgconfig(libswresample)"

inherit rpm
