SUMMARY = "Development files for FFmpeg's audio/video filter library"
DESCRIPTION = "The libavfilter library provides a generic audio/video filtering \
framework containing several filters, sources and sinks. \
 \
This subpackage contains the headers for FFmpeg libavfilter."
LICENSE = "GPL-3.0-or-later"

PV = "6.0"

RPM_NAME = "ffmpeg-6-libavfilter-devel-6.0-3.1.aarch64.rpm"
RPM_HASH = "a3f2142d3cade2d859cc378616c774fcbd3491a432aca1b37f9e3e2767fa77b10ede8287ab70327bcdc05c57261992c7ab944a3c87ceef27ec20f6234acd74df"

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
