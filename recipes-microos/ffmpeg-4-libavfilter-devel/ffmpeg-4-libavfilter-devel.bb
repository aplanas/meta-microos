SUMMARY = "Development files for FFmpeg's audio/video filter library"
DESCRIPTION = "The libavfilter library provides a generic audio/video filtering \
framework containing several filters, sources and sinks. \
 \
This subpackage contains the headers for FFmpeg libavfilter."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.4"

RPM_NAME = "ffmpeg-4-libavfilter-devel-4.4.4-1.1.aarch64.rpm"
RPM_HASH = "8cd8cb20bc8539a01d38c9a3ab327eeca01d230db558e24e4e7a3ac3921b159ef6a2e4c3c354d249fb2830fdac98ec2c1cb46af5a4c38e18a62b8e1daf754655"

RPROVIDES:${PN} += "ffmpeg-4-libavfilter-devel ffmpeg-4-libavfilter-devel(aarch-64) libavfilter-devel pkgconfig(libavfilter)"
RDEPENDS:${PN} += "/usr/bin/pkg-config ffmpeg-4-libavcodec-devel ffmpeg-4-libavformat-devel ffmpeg-4-libavresample-devel ffmpeg-4-libavutil-devel ffmpeg-4-libpostproc-devel ffmpeg-4-libswresample-devel ffmpeg-4-libswscale-devel libavfilter7_110 pkgconfig(libavcodec) pkgconfig(libavformat) pkgconfig(libavresample) pkgconfig(libavutil) pkgconfig(libpostproc) pkgconfig(libswresample) pkgconfig(libswscale)"

inherit rpm
