SUMMARY = "Development files for FFmpeg's audio/video filter library"
DESCRIPTION = "The libavfilter library provides a generic audio/video filtering \
framework containing several filters, sources and sinks. \
 \
This subpackage contains the headers for FFmpeg libavfilter."
LICENSE = "GPL-3.0-or-later"

PV = "5.1.3"

RPM_NAME = "ffmpeg-5-libavfilter-devel-5.1.3-1.2.aarch64.rpm"
RPM_HASH = "11d6414fe01c533a92c24e45cfbdb96c8d7b29a2d1ce93bc53316fbc37ddcdc11e1f5cbc3eee6443a291f2823fbaf093f56fec8d59f7f09192dd255645864484"

RPROVIDES:${PN} += "ffmpeg-5-libavfilter-devel ffmpeg-5-libavfilter-devel(aarch-64) libavfilter-devel pkgconfig(libavfilter)"
RDEPENDS:${PN} += "/usr/bin/pkg-config ffmpeg-5-libavcodec-devel ffmpeg-5-libavformat-devel ffmpeg-5-libavutil-devel ffmpeg-5-libpostproc-devel ffmpeg-5-libswresample-devel ffmpeg-5-libswscale-devel libavfilter8 pkgconfig(libavcodec) pkgconfig(libavformat) pkgconfig(libavutil) pkgconfig(libpostproc) pkgconfig(libswresample) pkgconfig(libswscale)"

inherit rpm
