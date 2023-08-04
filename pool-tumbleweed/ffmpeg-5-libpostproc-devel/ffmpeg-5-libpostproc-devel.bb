SUMMARY = "Development files for the FFmpeg post-processing library"
DESCRIPTION = "A library with video postprocessing filters, such as deblocking and \
deringing filters, noise reduction, automatic contrast and brightness \
correction, linear/cubic interpolating deinterlacing. \
 \
This subpackage contains the headers for FFmpeg libpostproc."
LICENSE = "GPL-3.0-or-later"

PV = "5.1.3"

RPM_NAME = "ffmpeg-5-libpostproc-devel-5.1.3-2.2.aarch64.rpm"
RPM_HASH = "fa7641ecef01f1724cbc01e8e0d71773b141c1dc421343a67bf63301e802ac4f9339666d83cabbe5a4e255356250958239d605ba5db9dfc1f683b4e1fa4fffbc"

RPROVIDES:${PN} += "ffmpeg-5-libpostproc-devel \
libpostproc-devel \
pkgconfig-libpostproc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ffmpeg-5-libavutil-devel \
libpostproc56 \
pkgconfig-libavutil"

inherit rpm
