SUMMARY = "Development files for FFmpeg's stream format library"
DESCRIPTION = "The libavformat library provides a generic framework for multiplexing \
and demultiplexing (muxing and demuxing) audio, video and subtitle \
streams. It encompasses multiple muxers and demuxers for multimedia \
container formats. \
 \
This subpackage contains the headers for FFmpeg libavformat."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.4"

RPM_NAME = "ffmpeg-4-libavformat-devel-4.4.4-1.1.aarch64.rpm"
RPM_HASH = "e581214f4f91c00439a5982bc0a0fbee8c6866c2f0b99ce235d32dbb3ff7a8c7fe39c1c181489534ba5612d01dd17dfa300b29da24f338395cd0ce6ac6a2f092"

RPROVIDES:${PN} += "ffmpeg-4-libavformat-devel ffmpeg-4-libavformat-devel(aarch-64) libavformat-devel pkgconfig(libavformat)"
RDEPENDS:${PN} += "/usr/bin/pkg-config ffmpeg-4-libavcodec-devel ffmpeg-4-libavutil-devel ffmpeg-4-libswresample-devel libavformat58_76 pkgconfig(libavcodec) pkgconfig(libavutil) pkgconfig(libswresample)"

inherit rpm
