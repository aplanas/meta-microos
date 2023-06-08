SUMMARY = "Header files for feature-reduced FFmpeg build"
DESCRIPTION = "FFmpeg is a multimedia framework. \
This package contains the headers accompanying ffmpeg-6-mini."
LICENSE = "GPL-3.0-or-later"

PV = "6.0"

RPM_NAME = "ffmpeg-6-mini-devel-6.0-2.1.aarch64.rpm"
RPM_HASH = "dab1c6f5d75c9e0868842b880ae902d70284e4ed66671811e34131da0976c9d5d15412427e7cceb6fe65eb5ee215b4b406b1d71ca98ec08fca9d5899527b88f0"

RPROVIDES:${PN} += "ffmpeg-6-mini-devel ffmpeg-6-mini-devel(aarch-64) libavcodec-devel libavdevice-devel libavfilter-devel libavformat-devel libavutil-devel libpostproc-devel libswresample-devel libswscale-devel pkgconfig(libavcodec) pkgconfig(libavdevice) pkgconfig(libavfilter) pkgconfig(libavformat) pkgconfig(libavutil) pkgconfig(libpostproc) pkgconfig(libswresample) pkgconfig(libswscale)"
RDEPENDS:${PN} += "/usr/bin/pkg-config ffmpeg-6-mini-libs pkgconfig(libavcodec) pkgconfig(libavfilter) pkgconfig(libavformat) pkgconfig(libavutil) pkgconfig(libpostproc) pkgconfig(libswresample) pkgconfig(libswscale) this-is-only-for-build-envs"

inherit rpm
