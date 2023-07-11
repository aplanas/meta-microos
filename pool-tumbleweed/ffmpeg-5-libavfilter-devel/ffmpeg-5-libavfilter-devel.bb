SUMMARY = "Development files for FFmpeg's audio/video filter library"
DESCRIPTION = "The libavfilter library provides a generic audio/video filtering \
framework containing several filters, sources and sinks. \
 \
This subpackage contains the headers for FFmpeg libavfilter."
LICENSE = "GPL-3.0-or-later"

PV = "5.1.3"

RPM_NAME = "ffmpeg-5-libavfilter-devel-5.1.3-2.1.aarch64.rpm"
RPM_HASH = "2087ff8c21b3c3cc98097d9081b0f87202f8997ddf039bd1de5e476b83d9d975d7c7523cb15a3b581e9df247f197591f6129645fa4559ce599118aee9d91763d"

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
