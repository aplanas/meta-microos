SUMMARY = "Development files for FFmpeg's codec library"
DESCRIPTION = "The libavcodec library provides a generic encoding/decoding framework \
and contains multiple decoders and encoders for audio, video and \
subtitle streams, and several bitstream filters. \
 \
This subpackage contains the headers for FFmpeg libavcodec."
LICENSE = "GPL-3.0-or-later"

PV = "6.0"

RPM_NAME = "ffmpeg-6-libavcodec-devel-6.0-2.4.aarch64.rpm"
RPM_HASH = "494a810ad0fc4da12b05278b7a3dee7603539a244f1c0d36181219c182738953037150f53b23f1018e367e732fee732e72c39c48e52ed5e0dd82b409c3cb0b45"

RPROVIDES:${PN} += "ffmpeg-6-libavcodec-devel \
libavcodec-devel \
pkgconfig-libavcodec"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ffmpeg-6-libavutil-devel \
libavcodec60 \
pkgconfig-libavutil \
pkgconfig-libswresample"

inherit rpm
