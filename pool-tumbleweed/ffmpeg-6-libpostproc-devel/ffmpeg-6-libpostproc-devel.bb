SUMMARY = "Development files for the FFmpeg post-processing library"
DESCRIPTION = "A library with video postprocessing filters, such as deblocking and \
deringing filters, noise reduction, automatic contrast and brightness \
correction, linear/cubic interpolating deinterlacing. \
 \
This subpackage contains the headers for FFmpeg libpostproc."
LICENSE = "GPL-3.0-or-later"

PV = "6.0"

RPM_NAME = "ffmpeg-6-libpostproc-devel-6.0-3.1.aarch64.rpm"
RPM_HASH = "534e808912adfed3fb97749b0d719da37eff49fb520af8e35a7006e49a0db86eab649d7b21fe272161d32751aa2077f93862c8e378e6d70bac5c2046b5835d55"

RPROVIDES:${PN} += "ffmpeg-6-libpostproc-devel \
libpostproc-devel \
pkgconfig-libpostproc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ffmpeg-6-libavutil-devel \
libpostproc57 \
pkgconfig-libavutil"

inherit rpm
