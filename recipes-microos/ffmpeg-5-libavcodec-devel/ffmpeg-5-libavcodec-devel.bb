SUMMARY = "Development files for FFmpeg's codec library"
DESCRIPTION = "The libavcodec library provides a generic encoding/decoding framework \
and contains multiple decoders and encoders for audio, video and \
subtitle streams, and several bitstream filters. \
 \
This subpackage contains the headers for FFmpeg libavcodec."
LICENSE = "GPL-3.0-or-later"

PV = "5.1.3"

RPM_NAME = "ffmpeg-5-libavcodec-devel-5.1.3-1.1.aarch64.rpm"
RPM_HASH = "26e6cf405c23b7e1894f6e033a50f97a25ef6465d4f7f8dbd8e61f06fd8016c6b30c4edb91412b6641246327f1aa8def7dab7b54dc695c681efe28078c12011e"

RPROVIDES:${PN} += "ffmpeg-5-libavcodec-devel ffmpeg-5-libavcodec-devel(aarch-64) libavcodec-devel pkgconfig(libavcodec)"
RDEPENDS:${PN} += "/usr/bin/pkg-config ffmpeg-5-libavutil-devel libavcodec59 pkgconfig(libavutil) pkgconfig(libswresample)"

inherit rpm
