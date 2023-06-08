SUMMARY = "Development files for FFmpeg's audio/video filter library"
DESCRIPTION = "The libavfilter library provides a generic audio/video filtering \
framework containing several filters, sources and sinks. \
 \
This subpackage contains the headers for FFmpeg libavfilter."
LICENSE = "GPL-3.0-or-later"

PV = "5.1.3"

RPM_NAME = "ffmpeg-5-libavfilter-devel-5.1.3-1.1.aarch64.rpm"
RPM_HASH = "81b727671504a43bf598822603f5e887c915ad6e344663204c17e63282cf98ff7f48cd45a9cdb0d17abeb2be2dc705466f0ae63ad2c29c53d499cfdf1edac0f9"

RPROVIDES:${PN} += "ffmpeg-5-libavfilter-devel ffmpeg-5-libavfilter-devel(aarch-64) libavfilter-devel pkgconfig(libavfilter)"
RDEPENDS:${PN} += "/usr/bin/pkg-config ffmpeg-5-libavcodec-devel ffmpeg-5-libavformat-devel ffmpeg-5-libavutil-devel ffmpeg-5-libpostproc-devel ffmpeg-5-libswresample-devel ffmpeg-5-libswscale-devel libavfilter8 pkgconfig(libavcodec) pkgconfig(libavformat) pkgconfig(libavutil) pkgconfig(libpostproc) pkgconfig(libswresample) pkgconfig(libswscale)"

inherit rpm
