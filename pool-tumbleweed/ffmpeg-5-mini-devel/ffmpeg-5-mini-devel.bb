SUMMARY = "Header files for feature-reduced FFmpeg build"
DESCRIPTION = "FFmpeg is a multimedia framework. \
This package contains the headers accompanying ffmpeg-5-mini."
LICENSE = "GPL-3.0-or-later"

PV = "5.1.3"

RPM_NAME = "ffmpeg-5-mini-devel-5.1.3-1.1.aarch64.rpm"
RPM_HASH = "60a58203a3d3e482e8b7d0ea90f8cd018003c11f335bb874d7b8722116f2e633fdf54ea7ea96cefe7bbf36bed1a22d6e32a2415423a90b78a39c201b4e59b55a"

RPROVIDES:${PN} += "ffmpeg-5-mini-devel \
ffmpeg-5-mini-devel(aarch-64) \
libavcodec-devel \
libavdevice-devel \
libavfilter-devel \
libavformat-devel \
libavutil-devel \
libpostproc-devel \
libswresample-devel \
libswscale-devel \
pkgconfig(libavcodec) \
pkgconfig(libavdevice) \
pkgconfig(libavfilter) \
pkgconfig(libavformat) \
pkgconfig(libavutil) \
pkgconfig(libpostproc) \
pkgconfig(libswresample) \
pkgconfig(libswscale)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ffmpeg-5-mini-libs \
pkgconfig(libavcodec) \
pkgconfig(libavfilter) \
pkgconfig(libavformat) \
pkgconfig(libavutil) \
pkgconfig(libpostproc) \
pkgconfig(libswresample) \
pkgconfig(libswscale) \
this-is-only-for-build-envs"

inherit rpm
