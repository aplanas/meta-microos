SUMMARY = "Development files for FFmpeg's audio/video filter library"
DESCRIPTION = "The libavfilter library provides a generic audio/video filtering \
framework containing several filters, sources and sinks. \
 \
This subpackage contains the headers for FFmpeg libavfilter."
LICENSE = "GPL-3.0-or-later"

PV = "6.0"

RPM_NAME = "ffmpeg-6-libavfilter-devel-6.0-2.2.aarch64.rpm"
RPM_HASH = "b3ab177524a4ddefac4fe26768be66397af33fda0bcff9c483d56644fac5dad4a17d98647898d1467f0d94de6fc224f77d9babdce817a7394e5a14db3dd8aa30"

RPROVIDES:${PN} += "ffmpeg-6-libavfilter-devel \
libavfilter-devel \
pkgconfig-libavfilter"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ffmpeg-6-libavcodec-devel \
ffmpeg-6-libavformat-devel \
ffmpeg-6-libavutil-devel \
ffmpeg-6-libpostproc-devel \
ffmpeg-6-libswresample-devel \
ffmpeg-6-libswscale-devel \
libavfilter9 \
pkgconfig-libavcodec \
pkgconfig-libavformat \
pkgconfig-libavutil \
pkgconfig-libpostproc \
pkgconfig-libswresample \
pkgconfig-libswscale"

inherit rpm
