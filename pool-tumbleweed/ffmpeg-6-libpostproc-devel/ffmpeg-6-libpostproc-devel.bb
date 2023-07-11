SUMMARY = "Development files for the FFmpeg post-processing library"
DESCRIPTION = "A library with video postprocessing filters, such as deblocking and \
deringing filters, noise reduction, automatic contrast and brightness \
correction, linear/cubic interpolating deinterlacing. \
 \
This subpackage contains the headers for FFmpeg libpostproc."
LICENSE = "GPL-3.0-or-later"

PV = "6.0"

RPM_NAME = "ffmpeg-6-libpostproc-devel-6.0-2.4.aarch64.rpm"
RPM_HASH = "e04c7e1f6b188f015b930eb6b52a28a9dd50ed8278f5586d01becf1b1d89cbeca76c6e849337153699b7b4c6ec39b6da428d6166aeb4d1a178e2d2a1f7560abf"

RPROVIDES:${PN} += "ffmpeg-6-libpostproc-devel \
libpostproc-devel \
pkgconfig-libpostproc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ffmpeg-6-libavutil-devel \
libpostproc57 \
pkgconfig-libavutil"

inherit rpm
