SUMMARY = "Development files for FFmpeg's audio/video filter library"
DESCRIPTION = "The libavfilter library provides a generic audio/video filtering \
framework containing several filters, sources and sinks. \
 \
This subpackage contains the headers for FFmpeg libavfilter."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.4"

RPM_NAME = "ffmpeg-4-libavfilter-devel-4.4.4-1.2.aarch64.rpm"
RPM_HASH = "05fc13b639d9b48a7b19c32b4f4958a92a50200d0d9bdbe43cb873a2f2a40c56e72c198f0f17de643f4fbf7275bf599398f2385829b0f6e103984bfa7a9254ea"

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
