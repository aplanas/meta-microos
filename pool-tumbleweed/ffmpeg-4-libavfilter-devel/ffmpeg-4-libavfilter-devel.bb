SUMMARY = "Development files for FFmpeg's audio/video filter library"
DESCRIPTION = "The libavfilter library provides a generic audio/video filtering \
framework containing several filters, sources and sinks. \
 \
This subpackage contains the headers for FFmpeg libavfilter."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.4"

RPM_NAME = "ffmpeg-4-libavfilter-devel-4.4.4-2.2.aarch64.rpm"
RPM_HASH = "d52c02025fe201f0de7aa9b8015ecec40f830dd3bcfeefa12a479eab6d1c28ee972191d676cf639bd6e705c9447c337b325f152acfaa872ca406e72b4019d7c7"

RPROVIDES:${PN} += "ffmpeg-4-libavfilter-devel \
libavfilter-devel \
pkgconfig-libavfilter"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ffmpeg-4-libavcodec-devel \
ffmpeg-4-libavformat-devel \
ffmpeg-4-libavresample-devel \
ffmpeg-4-libavutil-devel \
ffmpeg-4-libpostproc-devel \
ffmpeg-4-libswresample-devel \
ffmpeg-4-libswscale-devel \
libavfilter7-110 \
pkgconfig-libavcodec \
pkgconfig-libavformat \
pkgconfig-libavresample \
pkgconfig-libavutil \
pkgconfig-libpostproc \
pkgconfig-libswresample \
pkgconfig-libswscale"

inherit rpm
