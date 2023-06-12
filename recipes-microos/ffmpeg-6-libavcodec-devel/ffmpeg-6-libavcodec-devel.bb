SUMMARY = "Development files for FFmpeg's codec library"
DESCRIPTION = "The libavcodec library provides a generic encoding/decoding framework \
and contains multiple decoders and encoders for audio, video and \
subtitle streams, and several bitstream filters. \
 \
This subpackage contains the headers for FFmpeg libavcodec."
LICENSE = "GPL-3.0-or-later"

PV = "6.0"

RPM_NAME = "ffmpeg-6-libavcodec-devel-6.0-2.2.aarch64.rpm"
RPM_HASH = "fc8c49fc1c4ba928efec2e87ededa5498fa8eeddd21b6bd238cf8e4ebc93d63c5a7450cbdcf513a77c85c242688e3afd49d8c0fd7770e1f116b2a02d058b5ca5"

RPROVIDES:${PN} += "ffmpeg-6-libavcodec-devel ffmpeg-6-libavcodec-devel(aarch-64) libavcodec-devel pkgconfig(libavcodec)"
RDEPENDS:${PN} += "/usr/bin/pkg-config ffmpeg-6-libavutil-devel libavcodec60 pkgconfig(libavutil) pkgconfig(libswresample)"

inherit rpm
