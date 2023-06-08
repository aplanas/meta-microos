SUMMARY = "Development files for FFmpeg's audio/video filter library"
DESCRIPTION = "The libavfilter library provides a generic audio/video filtering \
framework containing several filters, sources and sinks. \
 \
This subpackage contains the headers for FFmpeg libavfilter."
LICENSE = "GPL-3.0-or-later"

PV = "6.0"

RPM_NAME = "ffmpeg-6-libavfilter-devel-6.0-2.1.aarch64.rpm"
RPM_HASH = "373db4ff14d207f4b6cbb20f30e7a14335d0c4f9b8c407a5f093937af0f6144a7ed124e6da944cd101718a92dfbb6da2ea53fedffa14d947e75f53d2bc6555a6"

RPROVIDES:${PN} += "ffmpeg-6-libavfilter-devel ffmpeg-6-libavfilter-devel(aarch-64) libavfilter-devel pkgconfig(libavfilter)"
RDEPENDS:${PN} += "/usr/bin/pkg-config ffmpeg-6-libavcodec-devel ffmpeg-6-libavformat-devel ffmpeg-6-libavutil-devel ffmpeg-6-libpostproc-devel ffmpeg-6-libswresample-devel ffmpeg-6-libswscale-devel libavfilter9 pkgconfig(libavcodec) pkgconfig(libavformat) pkgconfig(libavutil) pkgconfig(libpostproc) pkgconfig(libswresample) pkgconfig(libswscale)"

inherit rpm
