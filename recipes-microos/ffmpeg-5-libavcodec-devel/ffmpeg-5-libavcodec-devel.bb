SUMMARY = "Development files for FFmpeg's codec library"
DESCRIPTION = "The libavcodec library provides a generic encoding/decoding framework \
and contains multiple decoders and encoders for audio, video and \
subtitle streams, and several bitstream filters. \
 \
This subpackage contains the headers for FFmpeg libavcodec."
LICENSE = "GPL-3.0-or-later"

PV = "5.1.3"

RPM_NAME = "ffmpeg-5-libavcodec-devel-5.1.3-1.2.aarch64.rpm"
RPM_HASH = "7a0896a7d9e74f258f2ee267ae7af63b642aa88e325e507584af0b4d534562d36b49fcbdaae75b20b57dd38c67fb447c3819fc772f3bafff1c5f5b2903279926"

RPROVIDES:${PN} += "ffmpeg-5-libavcodec-devel \
ffmpeg-5-libavcodec-devel(aarch-64) \
libavcodec-devel \
pkgconfig(libavcodec)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
ffmpeg-5-libavutil-devel \
libavcodec59 \
pkgconfig(libavutil) \
pkgconfig(libswresample)"

inherit rpm
