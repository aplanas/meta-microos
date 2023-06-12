SUMMARY = "Development files for the FFmpeg post-processing library"
DESCRIPTION = "A library with video postprocessing filters, such as deblocking and \
deringing filters, noise reduction, automatic contrast and brightness \
correction, linear/cubic interpolating deinterlacing. \
 \
This subpackage contains the headers for FFmpeg libpostproc."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.4"

RPM_NAME = "ffmpeg-4-libpostproc-devel-4.4.4-1.2.aarch64.rpm"
RPM_HASH = "ad4ceacd32e2e0ddd950f1816b1154a09f20fe25b47576734dcfe9afb9e1a51c9b2433a588544d2e9ab1ab3e1bf41eb102bc67f16ada989c1163ac26a7e0ab04"

RPROVIDES:${PN} += "ffmpeg-4-libpostproc-devel \
ffmpeg-4-libpostproc-devel(aarch-64) \
libpostproc-devel \
pkgconfig(libpostproc)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
ffmpeg-4-libavutil-devel \
libpostproc55_9 \
pkgconfig(libavutil)"

inherit rpm
