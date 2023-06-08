SUMMARY = "Development files for the FFmpeg post-processing library"
DESCRIPTION = "A library with video postprocessing filters, such as deblocking and \
deringing filters, noise reduction, automatic contrast and brightness \
correction, linear/cubic interpolating deinterlacing. \
 \
This subpackage contains the headers for FFmpeg libpostproc."
LICENSE = "GPL-3.0-or-later"

PV = "5.1.3"

RPM_NAME = "ffmpeg-5-libpostproc-devel-5.1.3-1.1.aarch64.rpm"
RPM_HASH = "544c4f8ca2f59a019d0b9e01be92b936d4b27fc8ed9f02cc891fb894ae3681d14aa2e6f9cc326ff5719919fd37ea9458f7d4bce9096ce30204075dec6eabb28f"

RPROVIDES:${PN} += "ffmpeg-5-libpostproc-devel ffmpeg-5-libpostproc-devel(aarch-64) libpostproc-devel pkgconfig(libpostproc)"
RDEPENDS:${PN} += "/usr/bin/pkg-config ffmpeg-5-libavutil-devel libpostproc56 pkgconfig(libavutil)"

inherit rpm
