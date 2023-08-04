SUMMARY = "Development files for FFmpeg's audio/video filter library"
DESCRIPTION = "The libavfilter library provides a generic audio/video filtering \
framework containing several filters, sources and sinks. \
 \
This subpackage contains the headers for FFmpeg libavfilter."
LICENSE = "GPL-3.0-or-later"

PV = "5.1.3"

RPM_NAME = "ffmpeg-5-libavfilter-devel-5.1.3-2.2.aarch64.rpm"
RPM_HASH = "d41303cd0f0820b76e3961af42c943fc1a4d41054177854bd594b054cc1512551031d719efe40cff72cb5aa6aa1db48db30352787c30e965e03cd1f03b1641f7"

RPROVIDES:${PN} += "ffmpeg-5-libavfilter-devel \
libavfilter-devel \
pkgconfig-libavfilter"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ffmpeg-5-libavcodec-devel \
ffmpeg-5-libavformat-devel \
ffmpeg-5-libavutil-devel \
ffmpeg-5-libpostproc-devel \
ffmpeg-5-libswresample-devel \
ffmpeg-5-libswscale-devel \
libavfilter8 \
pkgconfig-libavcodec \
pkgconfig-libavformat \
pkgconfig-libavutil \
pkgconfig-libpostproc \
pkgconfig-libswresample \
pkgconfig-libswscale"

inherit rpm
