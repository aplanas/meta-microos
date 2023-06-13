SUMMARY = "Development files for FFmpeg's codec library"
DESCRIPTION = "The libavcodec library provides a generic encoding/decoding framework \
and contains multiple decoders and encoders for audio, video and \
subtitle streams, and several bitstream filters. \
 \
This subpackage contains the headers for FFmpeg libavcodec."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.4"

RPM_NAME = "ffmpeg-4-libavcodec-devel-4.4.4-1.2.aarch64.rpm"
RPM_HASH = "f129e555bf481e4112e5222e98843101f6e5e49200604a0fea0515fa413ea885d5b09d9244be8a6e1bd3502339e64bf1f6ecaee9e05b049e6db2ef33c8102c01"

RPROVIDES:${PN} += "ffmpeg-4-libavcodec-devel \
ffmpeg-4-libavcodec-devel(aarch-64) \
libavcodec-devel \
pkgconfig(libavcodec)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ffmpeg-4-libavresample-devel \
ffmpeg-4-libavutil-devel \
libavcodec58_134 \
pkgconfig(libavutil) \
pkgconfig(libswresample)"

inherit rpm
