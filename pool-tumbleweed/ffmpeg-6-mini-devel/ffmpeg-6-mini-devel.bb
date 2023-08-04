SUMMARY = "Header files for feature-reduced FFmpeg build"
DESCRIPTION = "FFmpeg is a multimedia framework. \
This package contains the headers accompanying ffmpeg-6-mini."
LICENSE = "GPL-3.0-or-later"

PV = "6.0"

RPM_NAME = "ffmpeg-6-mini-devel-6.0-3.1.aarch64.rpm"
RPM_HASH = "071195adc680271f455799ff156a43ff15f84cc948735503be820d1d5aca35f7403e48b0788b24502ec00a738b92406f09c0533930a2a867584ebbd505b1ff30"

RPROVIDES:${PN} += "ffmpeg-6-mini-devel \
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
ffmpeg-6-mini-libs \
pkgconfig-libavcodec \
pkgconfig-libavfilter \
pkgconfig-libavformat \
pkgconfig-libavutil \
pkgconfig-libpostproc \
pkgconfig-libswresample \
pkgconfig-libswscale \
this-is-only-for-build-envs"

inherit rpm
