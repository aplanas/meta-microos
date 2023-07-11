SUMMARY = "Header files for feature-reduced FFmpeg build"
DESCRIPTION = "FFmpeg is a multimedia framework. \
This package contains the headers accompanying ffmpeg-5-mini."
LICENSE = "GPL-3.0-or-later"

PV = "5.1.3"

RPM_NAME = "ffmpeg-5-mini-devel-5.1.3-2.1.aarch64.rpm"
RPM_HASH = "b044f195bb28e204ab3e10db3b1ffe15032d6d739f2a93fa1c9e3ba428e2523b21e49dbebdd1e04b79f1d21e84702b06833a200d7582abf7f9a387a6c684357a"

RPROVIDES:${PN} += "ffmpeg-5-mini-devel \
libavcodec-devel \
libavdevice-devel \
libavfilter-devel \
libavformat-devel \
libavutil-devel \
libpostproc-devel \
libswresample-devel \
libswscale-devel \
pkgconfig-libavcodec \
pkgconfig-libavdevice \
pkgconfig-libavfilter \
pkgconfig-libavformat \
pkgconfig-libavutil \
pkgconfig-libpostproc \
pkgconfig-libswresample \
pkgconfig-libswscale"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ffmpeg-5-mini-libs \
pkgconfig-libavcodec \
pkgconfig-libavfilter \
pkgconfig-libavformat \
pkgconfig-libavutil \
pkgconfig-libpostproc \
pkgconfig-libswresample \
pkgconfig-libswscale \
this-is-only-for-build-envs"

inherit rpm
